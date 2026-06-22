import java.util.List;

public class LibraryManager {

    public void processAllBorrowable(List<Borrowable> items) {
        for (Borrowable item : items) {
            if (item.isAvailable()) {
                System.out.println("Available");
            } else {
                System.out.println("Borrowed by " + item.getBorrowerId());
            }
        }
    }

    public void notifyAllUsers(List<Notifiable> users, String message) {
        for (Notifiable user : users) {
            user.sendNotification(message);
        }
    }
}