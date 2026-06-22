public class Reader {
    private String readerId;
    private String name;

    public Reader(String readerId, String name) {
        this.readerId = readerId;
        this.name = name;
    }

    @Override
    public String toString() {
        return readerId + " - " + name;
    }
}