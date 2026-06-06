public class Book {

    private String id;
    private String title;
    private String author;
    private int stock;
    private boolean referenceOnly;

    public Book(String id,
                String title,
                String author,
                int stock,
                boolean referenceOnly) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.referenceOnly = referenceOnly;
    }

    public String getTitle() {
        return title;
    }

    public boolean isReferenceOnly() {
        return referenceOnly;
    }

    public void decreaseStock() {
        if(stock > 0)
            stock--;
    }

    public void increaseStock() {
        stock++;
    }
}