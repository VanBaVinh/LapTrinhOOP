import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Reader> readers;

    public Library() {

        readers =
                new ArrayList<>();
    }

    public void addReader(
            Reader reader) {

        readers.add(reader);
    }


    //Yeu cau 1

    public void printAllReaders() {

        for(Reader r : readers){

            System.out.println(
                    r.getInfo()
            );

        }

    }


    //Yeu cau 2

    public double calculateTotalLateFee(
            int daysLate) {

        double total = 0;

        for(Reader r : readers){

            total +=
                    r.calculateLateFee(
                            daysLate
                    );

        }

        return total;
    }


    //Yeu cau 3

    public Reader findReaderByName(
            String keyword){

        for(Reader r : readers){

            if(
                    r.getName()
                            .toLowerCase()
                            .contains(
                                    keyword.toLowerCase()
                            )
            ){

                return r;

            }

        }

        return null;
    }


    //Yeu cau 4

    public void printSeniorReaders(){

        for(Reader r : readers){

            if(
                    r instanceof SeniorReader
            ){

                SeniorReader sr =
                        (SeniorReader)r;

                System.out.println(
                        sr.getInfo()
                );

                System.out.println(
                        "Card Number: "
                                +sr.getSeniorCardNumber()
                );

            }

        }

    }

    public List<Reader> getReaders() {

        return readers;
    }

}