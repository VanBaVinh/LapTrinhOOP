public class FacultyReader extends Reader {

    private String type;

    public FacultyReader(
            String id,
            String name,
            String type) {

        super(id,name);

        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Giang vien";
    }

    @Override
    public double calculateLateFee(
            int daysLate) {

        return daysLate*3000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    protected boolean
    checkSpecialCondition(
            Book book) {

        return true;
    }

    @Override
    protected String
    getSpecialConditionMessage() {

        return "";
    }
}