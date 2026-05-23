import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<BorrowSlip> slips;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
        slips = new ArrayList<>();
    }

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

    public void searchByTitle(String keyword) {

        for (Book b : books) {

            if (b.getTitle()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                System.out.println(b.getTitle());
            }
        }
    }

    public void searchByAuthor(String keyword) {

        for (Book b : books) {

            if (b.getAuthor()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                System.out.println(b.getTitle());
            }
        }
    }
}