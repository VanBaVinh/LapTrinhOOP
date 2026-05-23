import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 =
                new Book(
                        "B01",
                        "Java OOP",
                        "Nguyen Van A",
                        2024,
                        5);

        Reader reader1 =
                new Reader(
                        "R01",
                        "Tran Van B",
                        "b@gmail.com",
                        ReaderType.SINH_VIEN);

        library.addBook(book1);
        library.addReader(reader1);

        Librarian librarian =
                new Librarian();

        librarian.borrowBook(
                library,
                reader1,
                book1,
                "PM01");

        BorrowSlip slip =
                library.getSlips().get(0);

        librarian.returnBook(
                slip,
                LocalDate.now().plusDays(10));
    }
}