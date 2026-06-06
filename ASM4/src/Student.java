public class Student extends Reader {

    public Student(String readerId,
                   String fullName,
                   String email) {

        super(readerId, fullName, email);
    }

    @Override
    public int getMaxBorrow() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Student";
    }
}