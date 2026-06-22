public class BorrowSlip implements Returnable {
    private String slipId;
    private String readerId;
    private String bookId;
    private String dueDate;
    private String returnDate;

    public BorrowSlip(String slipId, String readerId, String bookId, String dueDate) {
        this.slipId = slipId;
        this.readerId = readerId;
        this.bookId = bookId;
        this.dueDate = dueDate;
    }

    @Override
    public void confirmReturn(String date) {
        returnDate = date;
    }

    @Override
    public String getReturnDate() {
        return returnDate;
    }

    @Override
    public boolean isReturned() {
        return returnDate != null;
    }
}