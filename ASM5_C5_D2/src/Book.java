public class Book implements Comparable<Book> {
    private String bookId;
    private String title;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other) {
        return this.bookId.compareTo(other.bookId);
    }

    @Override
    public String toString() {
        return bookId + " - " + title;
    }
}