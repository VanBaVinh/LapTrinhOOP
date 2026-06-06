public class Librarian {

    public void printReaderInfo(
            Reader reader) {

        System.out.println(
                reader.getInfo()
        );
    }

    public void printLateFee(
            Reader reader,
            int daysLate) {

        System.out.println(
                "Late fee: "
                        + reader.calculateLateFee(daysLate)
        );
    }

}