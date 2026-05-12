public class Circle {

    double radius;

    public void printInfo() {
        System.out.println("Radius: " + radius);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}