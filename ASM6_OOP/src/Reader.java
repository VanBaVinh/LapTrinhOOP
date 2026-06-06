public abstract class Reader {

    protected String id;
    protected String name;

    public Reader(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "ID: " + id + " | Name: " + name;
    }

    public abstract double calculateLateFee(int daysLate);

    public abstract int getMaxBorrowLimit();
}