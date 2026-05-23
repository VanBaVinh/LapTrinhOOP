public class Reader {

    private String readerId;
    private String fullName;
    private String email;
    private ReaderType type;

    public Reader(String readerId,
                  String fullName,
                  String email,
                  ReaderType type) {

        this.readerId = readerId;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
    }

    public int getMaxBorrowLimit() {

        if(type == ReaderType.SINH_VIEN){
            return 3;
        }

        return 5;
    }

    public String getFullName() {
        return fullName;
    }
}