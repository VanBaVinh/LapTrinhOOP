import java.time.LocalDate;

public class Librarian {

    public void borrowBook(
            Library library,
            Reader reader,
            Book book,
            String slipId) {

        if (!book.isAvailable()) {

            System.out.println("Sach da het.");
            return;
        }

        book.borrowBook();

        BorrowSlip slip =
                new BorrowSlip(
                        slipId,
                        reader,
                        book,
                        LocalDate.now(),
                        LocalDate.now().plusDays(7));

        library.addBorrowSlip(slip);

        System.out.println("Muon sach thanh cong.");
    }

    public void returnBook(
            BorrowSlip slip,
            LocalDate returnDate) {

        slip.getBook().returnBook();

        long fine =
                slip.calculateFine(returnDate);

        slip.setReturned(true);

        System.out.println(
                "Tien phat: "
                        + fine + " VND");
    }
}