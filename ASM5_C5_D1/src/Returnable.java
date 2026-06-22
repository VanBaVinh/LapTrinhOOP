import java.time.LocalDate;

public interface Returnable {
    void confirmReturn(String date);

    String getReturnDate();

    boolean isReturned();

    default boolean isLate(String dueDate) {
        LocalDate due = LocalDate.parse(dueDate);
        return LocalDate.now().isAfter(due) && !isReturned();
    }
}