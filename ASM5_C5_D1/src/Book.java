public class Book implements Borrowable {
    private String bookId;
    private String title;
    private String author;
    private String borrowerId;
    private String borrowDate;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrowBy(String readerId, String date) {
        if (!isAvailable()) {
            System.out.println("Book is not available");
            return;
        }

        borrowerId = readerId;
        borrowDate = date;
        System.out.println(title + " borrowed by " + readerId);
    }

    @Override
    public void returnBook(String date) {
        System.out.println(title + " returned on " + date);
        borrowerId = null;
        borrowDate = null;
    }

    @Override
    public boolean isAvailable() {
        return borrowerId == null;
    }

    @Override
    public String getBorrowerId() {
        return borrowerId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}