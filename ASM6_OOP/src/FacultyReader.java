public class FacultyReader extends Reader {

    private String department;

    public FacultyReader(
            String id,
            String name,
            String department) {

        super(id, name);

        this.department = department;
    }

    @Override
    public double calculateLateFee(int daysLate) {

        return daysLate * 2000;
    }

    @Override
    public int getMaxBorrowLimit() {

        return 5;
    }

    @Override
    public String getInfo() {

        return super.getInfo()
                + " | Department: "
                + department
                + " [Faculty]";
    }

}