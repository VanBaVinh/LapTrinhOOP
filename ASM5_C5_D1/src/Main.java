import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("B001", "Clean Code", "Robert Martin");
        Book b2 = new Book("B002", "Design Patterns", "GoF");

        b1.borrowBy("R001", "2024-09-01");

        List<Borrowable> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        LibraryManager manager = new LibraryManager();
        manager.processAllBorrowable(books);

        Reader r1 = new Reader("R001", "Nguyen Van A");
        Reader r2 = new Reader("R002", "Tran Thi B");

        List<Notifiable> readers = new ArrayList<>();
        readers.add(r1);
        readers.add(r2);

        manager.notifyAllUsers(readers, "Library will close tomorrow");

        Fine fine = new Fine("F001", "R001");
        fine.addFine(15000);
        System.out.println("Fine: " + fine.getTotalFine());

        BorrowSlip slip = new BorrowSlip(
                "S001",
                "R001",
                "B001",
                "2024-09-15"
        );

        slip.confirmReturn("2024-09-14");
        System.out.println("Returned: " + slip.isReturned());

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);

        System.out.println("Books found: "
                + library.searchByTitle("Code").size());
    }
}