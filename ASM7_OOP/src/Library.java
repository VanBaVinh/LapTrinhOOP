import java.util.ArrayList;

public class Library {

    private ArrayList<Reader> readers;
    private ArrayList<Book> books;
    private ArrayList<BorrowSlip> slips;

    private LateFeePolicy feePolicy;

    public Library() {

        readers = new ArrayList<>();
        books = new ArrayList<>();
        slips = new ArrayList<>();

        feePolicy =
                new StandardFeePolicy();
    }

    public void addReader(
            Reader r) {

        readers.add(r);
    }

    public void addBook(
            Book b) {

        books.add(b);
    }

    public void setFeePolicy(
            LateFeePolicy policy) {

        feePolicy = policy;
    }

    public double calculateTotalFee(
            int daysLate) {

        double total = 0;

        for(Reader r:readers){

            double base =
                    r.calculateLateFee(
                            daysLate);

            double adjusted =
                    feePolicy.applyPolicy(
                            base);

            System.out.println(
                    r.getFullName()
                            + " : "
                            + adjusted);

            total += adjusted;
        }

        return total;
    }
}