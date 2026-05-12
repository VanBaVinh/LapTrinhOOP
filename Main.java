import java.awt.print.Book;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        book b1 = new book();
        b1.title = "Java";
        b1.author = "John Doe ";
        b1.price = 100;
        b1.inStook = true;
        b1.printInfo();
        b1.applyDiscount(10);
        System.out.println("-------");

        b1.printInfo(); System.out.println("-------");


        book b2 = new book();
        b2.title = "C++";
        b2.author = "John Doe";
        b2.price = 150;
        b2.inStook = true;
        b2.printInfo();
        b2.applyDiscount(10);
        System.out.println("-------");

        b2.printInfo(); System.out.println("-------");

        book b3 = new book(); b3.title = "Python";
        b3.author = "John Doe"; b3.price = 200;
        b3.inStook = true; b3.printInfo();
        b3.applyDiscount(10);
        System.out.println("-------");
        b3.printInfo();
    }
}