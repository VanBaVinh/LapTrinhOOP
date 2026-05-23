import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books =
            new ArrayList<>();

    private ArrayList<Reader> readers =
            new ArrayList<>();

    private ArrayList<BorrowSlip> slips =
            new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addBorrowSlip(BorrowSlip slip) {
        slips.add(slip);
    }

    public ArrayList<BorrowSlip> getSlips() {
        return slips;
    }

    // Đếm số sách đang mượn
    public int countBorrowedBooks(
            Reader reader) {

        int count = 0;

        for(BorrowSlip slip : slips){

            if(slip.getReader().equals(reader)
                    && !slip.isReturned()){

                count++;
            }
        }

        return count;
    }

    // Tìm theo tên
    public void searchByTitle(
            String keyword){

        for(Book book : books){

            if(book.getTitle()
                    .toLowerCase()
                    .contains(
                            keyword.toLowerCase())){

                System.out.println(
                        book.getTitle());
            }
        }
    }

    // Tìm theo tác giả
    public void searchByAuthor(
            String keyword){

        for(Book book : books){

            if(book.getAuthor()
                    .toLowerCase()
                    .contains(
                            keyword.toLowerCase())){

                System.out.println(
                        book.getTitle());
            }
        }
    }

    // Danh sách quá hạn
    public void showOverdueSlips(
            LocalDate currentDate){

        System.out.println(
                "\n=== PHIEU QUA HAN ===");

        for(BorrowSlip slip : slips){

            if(slip.isOverdue(
                    currentDate)){

                System.out.println(
                        slip);
            }
        }
    }
}