public class Main {
    public static void main(String[] args){
        Book book1 = new Book();

        Book book2 = new Book("Lập Trình Java", "Nguyễn Văn A",2024,150000 );

        Book book3 = new Book("C#", "Trần Văn B");

        System.out.println("\n====Thông Tin Ban Đầu====");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book2.applyDiscount(10);
        book3.applyDiscount(20);

        System.out.println("\n=== Sau khi giảm giá ===");
        book2.displayInfo();
        book3.displayInfo();
    }
}