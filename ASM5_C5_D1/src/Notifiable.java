import java.util.List;

public interface Notifiable {
    void sendNotification(String message);

    List<String> getNotificationHistory();

    default void sendOverdueNotification() {
        sendNotification("Book is overdue");
    }
}