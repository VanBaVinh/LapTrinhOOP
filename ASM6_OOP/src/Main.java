public class Main {

    public static void main(String[] args) {

        Library library =
                new Library();

        Reader r1 =
                new StudentReader(
                        "S01",
                        "Nguyen Van A",
                        "CNTT"
                );

        Reader r2 =
                new FacultyReader(
                        "F01",
                        "Tran Van B",
                        "Khoa CNTT"
                );

        Reader r3 =
                new SeniorReader(
                        "SR01",
                        "Le Van C",
                        "CC2024001"
                );


        library.addReader(r1);
        library.addReader(r2);
        library.addReader(r3);


        System.out.println(
                "===== ALL READERS ====="
        );

        library.printAllReaders();


        System.out.println();

        System.out.println(
                "Total fee: "
                        + library.calculateTotalLateFee(
                        5
                )
        );


        System.out.println();

        Reader result =
                library.findReaderByName(
                        "Le"
                );

        if(result != null){

            System.out.println(
                    "Found:"
            );

            System.out.println(
                    result.getInfo()
            );

        }


        System.out.println();

        System.out.println(
                "===== SENIOR LIST ====="
        );

        library.printSeniorReaders();

    }

}