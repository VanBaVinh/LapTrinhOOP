public class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }


    Rectangle(double side) {
        width = side;
        height = side;
    }


    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }


    void scale(double factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }

    double getArea() {
        return width * height;
    }


    double getPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }


    void displayInfo() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Có phải hình vuông không? " + isSquare());
        System.out.println();
    }
}