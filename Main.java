public class Main {

    public static void main(String[] args) {

        // Tạo mảng 5 object Circle
        Circle[] circles = new Circle[5];

        // Tạo từng object
        circles[0] = new Circle();
        circles[0].radius = 1;

        circles[1] = new Circle();
        circles[1].radius = 2;

        circles[2] = new Circle();
        circles[2].radius = 3;

        circles[3] = new Circle();
        circles[3].radius = 4;

        circles[4] = new Circle();
        circles[4].radius = 5;

        // Biến lưu tổng diện tích
        double totalArea = 0;

        // Duyệt mảng và in thông tin
        for (int i = 0; i < circles.length; i++) {

            System.out.println("=== Circle " + (i + 1) + " ===");

            circles[i].printInfo();

            System.out.println("Area: " + circles[i].area());

            System.out.println("Circumference: " + circles[i].circumference());

            System.out.println("----------------");

            // Cộng diện tích
            totalArea += circles[i].area();
        }

        // In tổng diện tích
        System.out.println("Total Area: " + totalArea);
    }
}