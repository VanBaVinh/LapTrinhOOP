public class Book {

    private String id;
    private String title;
    private int quantity;

    public Book(
            String id,
            String title,
            int quantity) {

        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public boolean isAvailable() {

        return quantity > 0;
    }

    public String getTitle() {

        return title;
    }

}