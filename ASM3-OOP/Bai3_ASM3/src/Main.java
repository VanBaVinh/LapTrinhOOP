import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Library library =
                new Library();

        Book book1 =
                new Book(
                        "B01",
                        "Java OOP",
                        "Nguyen Van A",
                        2024,
                        2);

        Book book2 =
                new Book(
                        "B02",
                        "Python",
                        "Tran Van C",
                        2023,
                        3);

        Reader reader1 =
                new Reader(
                        "R01",
                        "Nguyen Van B",
                        "b@gmail.com",
                        ReaderType.SINH_VIEN);

        library.addBook(book1);
        library.addBook(book2);
        library.addReader(reader1);

        Librarian librarian =
                new Librarian();

        // Mượn sách
        librarian.borrowBook(
                library,
                reader1,
                book1,
                "PM01");

        // Tìm kiếm theo tên
        System.out.println(
                "\nTim theo ten:");

        library.searchByTitle(
                "java");

        // Tìm kiếm theo tác giả
        System.out.println(
                "\nTim theo tac gia:");

        library.searchByAuthor(
                "tran");

        // Trả sách trễ 3 ngày
        BorrowSlip slip =
                library.getSlips()
                        .get(0);

        librarian.returnBook(
                slip,
                LocalDate.now()
                        .plusDays(10));

        // Kiểm tra quá hạn
        library.showOverdueSlips(
                LocalDate.now()
                        .plusDays(15));
    }
}