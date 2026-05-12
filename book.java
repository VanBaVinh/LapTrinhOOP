public class book {
    String title;
    String author;
    String publisher;
    double price;
    boolean inStook;

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Available: " + inStook); }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public double getPrice() {
        return price;
    }
    public double calculateDiscountPrice(double percent) {
        return price - (price * percent / 100); }

}
