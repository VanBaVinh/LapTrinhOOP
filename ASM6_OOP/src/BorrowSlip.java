public class BorrowSlip {

    private Reader reader;
    private Book book;
    private String borrowDate;

    public BorrowSlip(
            Reader reader,
            Book book,
            String borrowDate) {

        this.reader = reader;
        this.book = book;
        this.borrowDate = borrowDate;
    }

}