public class Book {

    private String bookId;
    private String title;
    private String author;
    private int publishYear;
    private int quantity;

    public Book(String bookId, String title,
                String author, int publishYear,
                int quantity) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public void borrowBook() {
        if(quantity > 0){
            quantity--;
        }
    }

    public void returnBook() {
        quantity++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}