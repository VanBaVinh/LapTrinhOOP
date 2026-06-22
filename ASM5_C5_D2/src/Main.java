import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(" BAI 1 ");

        GenericStack<String> actions = new GenericStack<>();

        actions.push("Muon sach B001");
        actions.push("Tra sach B002");
        actions.push("Cap nhat doc gia R001");

        System.out.println("Peek: " + actions.peek());

        System.out.println("Pop: " + actions.pop());
        System.out.println("Pop: " + actions.pop());

        GenericStack<Integer> errors = new GenericStack<>();

        errors.push(100);
        errors.push(200);
        errors.push(404);

        while (!errors.isEmpty()) {
            System.out.println(errors.pop());
        }

        System.out.println("\n BAI 2 ");

        Pair<String, Integer> p1 =
                new Pair<>("B001", 15);

        Pair<String, Integer> p2 =
                new Pair<>("B002", 8);

        if (PairUtils.comparePairs(p1, p2)) {
            System.out.println("Higher: " + p1);
        } else {
            System.out.println("Higher: " + p2);
        }

        Pair<String, String> reader =
                new Pair<>("Nguyen Van A", "R001");

        Pair<String, String> swapped =
                PairUtils.swap(reader);

        System.out.println(swapped);

        System.out.println("\n BAI 3 ");

        Book[] books = {
                new Book("B003", "Java"),
                new Book("B001", "OOP"),
                new Book("B002", "Database")
        };

        Book minBook =
                LibraryUtils.findMin(books);

        System.out.println("Min Book: " + minBook);

        List<Book> bookList =
                new ArrayList<>();

        bookList.add(new Book("B001", "OOP"));
        bookList.add(new Book("B002", "Java"));

        List<Reader> readerList =
                new ArrayList<>();

        readerList.add(
                new Reader("R001", "An")
        );

        readerList.add(
                new Reader("R002", "Binh")
        );

        LibraryUtils.printAll(bookList);

        LibraryUtils.printAll(readerList);

        List<Object> destination =
                new ArrayList<>();

        LibraryUtils.copyList(destination, bookList);

        System.out.println("Copied:");

        LibraryUtils.printAll(destination);
    }
}