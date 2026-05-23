import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowSlip {

    private String slipId;
    private Reader reader;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean returned;

    public BorrowSlip(String slipId,
                      Reader reader,
                      Book book,
                      LocalDate borrowDate,
                      LocalDate dueDate) {

        this.slipId = slipId;
        this.reader = reader;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returned = false;
    }

    public Reader getReader() {
        return reader;
    }

    public Book getBook() {
        return book;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public boolean isOverdue(LocalDate currentDate) {
        return !returned && currentDate.isAfter(dueDate);
    }

    public long calculateFine(LocalDate returnDate) {

        if(returnDate.isAfter(dueDate)) {

            long lateDays =
                    ChronoUnit.DAYS.between(
                            dueDate,
                            returnDate);

            return lateDays * 5000;
        }

        return 0;
    }

    @Override
    public String toString() {

        return "Ma phieu: " + slipId +
                " | Doc gia: " +
                reader.getFullName();
    }
}