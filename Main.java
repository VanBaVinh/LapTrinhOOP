
public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.width = 5;
        r1.height = 3;

        r1.printInfo();
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is Square: " + r1.isSquare());

        System.out.println("-------");


        Rectangle r2 = new Rectangle();
        r2.width = 4;
        r2.height = 4;

        r2.printInfo();
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Is Square: " + r2.isSquare());
    }
}