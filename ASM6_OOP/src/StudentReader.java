public class StudentReader extends Reader {

    private String major;

    public StudentReader(
            String id,
            String name,
            String major) {

        super(id, name);
        this.major = major;
    }

    @Override
    public double calculateLateFee(int daysLate) {

        return daysLate * 1000;
    }

    @Override
    public int getMaxBorrowLimit() {

        return 3;
    }

    @Override
    public String getInfo() {

        return super.getInfo()
                + " | Major: "
                + major
                + " [Student]";
    }

}