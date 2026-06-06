public class StudentReader extends Reader {

    private String type;

    public StudentReader(
            String id,
            String name,
            String type) {

        super(id,name);

        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Sinh vien";
    }

    @Override
    public double calculateLateFee(
            int daysLate) {

        return daysLate*5000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    protected boolean
    checkSpecialCondition(
            Book book) {

        return !book.isReferenceOnly();
    }

    @Override
    protected String
    getSpecialConditionMessage() {

        return "Sach tham khao khong duoc muon";
    }
}