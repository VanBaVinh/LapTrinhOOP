public abstract class Reader {

    protected String readerId;
    protected String fullName;
    protected int currentBorrowCount;

    public Reader(String readerId,
                  String fullName) {

        this.readerId = readerId;
        this.fullName = fullName;
    }

    public abstract String getInfo();

    public abstract double calculateLateFee(
            int daysLate);

    public abstract int getMaxBorrowLimit();

    public final BorrowResult processBorrow(
            Book book) {

        if(!checkBorrowQuota()) {

            return new BorrowResult(
                    false,
                    "Da dat gioi han muon");
        }

        if(!checkSpecialCondition(book)) {

            return new BorrowResult(
                    false,
                    getSpecialConditionMessage());
        }

        book.decreaseStock();

        currentBorrowCount++;

        onBorrowSuccess(book);

        return new BorrowResult(
                true,
                "Muon thanh cong: "
                        + book.getTitle());
    }

    private boolean checkBorrowQuota() {

        return currentBorrowCount
                < getMaxBorrowLimit();
    }

    protected abstract boolean
    checkSpecialCondition(Book book);

    protected abstract String
    getSpecialConditionMessage();

    protected void onBorrowSuccess(
            Book book) {

        System.out.println(
                fullName +
                        " muon "
                        + book.getTitle());
    }

    public String getFullName() {
        return fullName;
    }
}