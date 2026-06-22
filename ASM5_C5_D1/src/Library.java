import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> searchByTitle(String keyword) {
        List<Book> result = new ArrayList<>();
        String key = Searchable.normalizeKeyword(keyword);

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(key)) {
                result.add(book);
            }
        }

        return result;
    }

    @Override
    public List<Book> searchByAuthor(String keyword) {
        List<Book> result = new ArrayList<>();
        String key = Searchable.normalizeKeyword(keyword);

        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(key)) {
                result.add(book);
            }
        }

        return result;
    }
}