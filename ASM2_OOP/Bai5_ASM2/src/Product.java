package model;

import util.ProductValidator;

public class Product {

    private String productCode;
    private String name;
    private double price;
    private int quantity;


    private static int counter = 1;
    private static int totalProducts = 0;
    private static double totalRevenue = 0;


    public Product() {
        this("Unknown", 0, 0);
    }


    public Product(String name, double price) {
        this(name, price, 0);
    }


    public Product(String name, double price, int quantity) {
        this.productCode = String.format("P-%04d", counter);
        counter++;

        setName(name);
        setPrice(price);
        setQuantity(quantity);

        totalProducts++;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Tên sản phẩm không hợp lệ. Gán mặc định: Unknown");
            this.name = "Unknown";
        }
    }

    public void setPrice(double price) {
        if (ProductValidator.isValidPrice(price)) {
            this.price = price;
        } else {
            System.out.println("Giá không hợp lệ. Gán mặc định: 0");
            this.price = 0;
        }
    }

    public void setQuantity(int quantity) {
        if (ProductValidator.isValidQuantity(quantity)) {
            this.quantity = quantity;
        } else {
            System.out.println("Số lượng không hợp lệ. Gán mặc định: 0");
            this.quantity = 0;
        }
    }

    public void sell(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            totalRevenue += amount * price;
            System.out.println("Đã bán " + amount + " sản phẩm " + name);
        } else {
            System.out.println("Không thể bán " + amount + " sản phẩm " + name);
        }
    }

    public void restock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Đã nhập thêm " + amount + " sản phẩm " + name);
        } else {
            System.out.println("Số lượng nhập phải lớn hơn 0.");
        }
    }

    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + productCode);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá: " + price);
        System.out.println("Số lượng tồn kho: " + quantity);
        System.out.println();
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static String getStoreReport() {
        return "=== Báo cáo cửa hàng ===\n"
                + "Tổng số sản phẩm đã tạo: " + totalProducts + "\n"
                + "Tổng doanh thu: " + totalRevenue;
    }
}