public class Main {

    public static void main(String[] args) {

        Library library =
                new Library();

        library.addReader(
                new StudentReader(
                        "SV01",
                        "Nguyen Van A",
                        "SV"));

        library.addReader(
                new FacultyReader(
                        "GV01",
                        "Tran Thi B",
                        "GV"));

        library.addReader(
                new SeniorReader(
                        "CC01",
                        "Le Van C",
                        "CC"));

        System.out.println(
                "=== Thang binh thuong ===");

        library.calculateTotalFee(7);

        library.setFeePolicy(
                new CharityFeePolicy());

        System.out.println(
                "\n=== Thang tu thien ===");

        library.calculateTotalFee(7);

        library.setFeePolicy(
                new WaivedFeePolicy());

        System.out.println(
                "\n=== Thang khai truong ===");

        library.calculateTotalFee(7);
    }
}