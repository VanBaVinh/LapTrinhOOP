import model.Product;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Bút bi", 5000);
        Product p3 = new Product("Vở học sinh", 12000, 100);
        Product p4 = new Product("Laptop", 15000000, 10);

        System.out.println("=== Danh sách sản phẩm ===");
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();

        p2.restock(50);

        p3.sell(20);
        p4.sell(2);
        p4.sell(20);

        System.out.println("Mã sản phẩm tự động:");
        System.out.println(p1.getProductCode());
        System.out.println(p2.getProductCode());
        System.out.println(p3.getProductCode());
        System.out.println(p4.getProductCode());

        System.out.println();
        System.out.println(Product.getStoreReport());
    }
}