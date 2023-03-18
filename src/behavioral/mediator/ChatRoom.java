package behavioral.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessages(User user, String message) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime.format(formatter);

        System.out.println(formattedDateTime + " [" + user.getName() + "]: " + message);
    }
}
