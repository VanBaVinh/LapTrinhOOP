public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(
                "B01",
                "Java Programming",
                "Nguyen Van A",
                2024,
                10);

        Book b2 = new Book(
                "B02",
                "OOP Basics",
                "Tran Van B",
                2023,
                5);

        Student s1 = new Student(
                "SV01",
                "Nguyen Van Nam",
                "nam@gmail.com");

        Student s2 = new Student(
                "SV02",
                "Le Thi Hoa",
                "hoa@gmail.com");

        Lecturer l1 = new Lecturer(
                "GV01",
                "Tran Van Minh",
                "minh@gmail.com");

        library.addBook(b1);
        library.addBook(b2);

        library.addReader(s1);
        library.addReader(s2);
        library.addReader(l1);

        library.printBooks();
        library.printReaders();

        System.out.println("\n===== MAX BORROW =====");
        System.out.println(
                s1.getFullName()
                        + ": "
                        + s1.getMaxBorrow());

        System.out.println(
                l1.getFullName()
                        + ": "
                        + l1.getMaxBorrow());
    }
}