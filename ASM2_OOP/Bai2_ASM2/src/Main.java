public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("=== Hình 1 ===");
        r1.displayInfo();

        System.out.println("=== Hình 2 ===");
        r2.displayInfo();

        System.out.println("=== Hình 3 ===");
        r3.displayInfo();

        Rectangle r4 = new Rectangle(r3);

        System.out.println("=== Hình 4 (Bản sao của Hình 3) ===");
        r4.displayInfo();

        r4.scale(0.5);

        System.out.println("=== Hình 4 sau khi scale(0.5) ===");
        r4.displayInfo();
    }
}