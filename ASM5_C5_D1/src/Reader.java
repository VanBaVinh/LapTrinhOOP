import java.util.ArrayList;
import java.util.List;

public class Reader implements Notifiable {
    private String readerId;
    private String name;
    private List<String> notifications = new ArrayList<>();

    public Reader(String readerId, String name) {
        this.readerId = readerId;
        this.name = name;
    }

    @Override
    public void sendNotification(String message) {
        notifications.add(message);
        System.out.println(name + ": " + message);
    }

    @Override
    public List<String> getNotificationHistory() {
        return notifications;
    }
}