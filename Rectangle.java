public class Rectangle {


    double width;
    double height;


    public void printInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}