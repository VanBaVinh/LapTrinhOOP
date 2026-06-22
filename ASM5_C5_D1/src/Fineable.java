public interface Fineable {
    void addFine(double amount);

    double getTotalFine();

    boolean hasPaidFine();

    void payFine();

    default double calculateTotalFine(int days) {
        return days * 5000;
    }

    static boolean isValidFineAmount(double amount) {
        return amount >= 0;
    }
}