public class SeniorReader
        extends Reader {

    private String card;

    public SeniorReader(
            String id,
            String name,
            String card) {

        super(id,name);

        this.card = card;
    }

    @Override
    public String getInfo() {

        return "Nguoi cao tuoi";
    }

    @Override
    public double calculateLateFee(
            int daysLate) {

        return 0;
    }

    @Override
    public int getMaxBorrowLimit() {

        return 2;
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

    @Override
    protected void onBorrowSuccess(
            Book book) {

        super.onBorrowSuccess(book);

        System.out.println(
                "Da ghi nhan nguoi cao tuoi");
    }
}