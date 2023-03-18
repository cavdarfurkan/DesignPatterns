package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoom();

        User john = new User("john", mediator);
        User jane = new User("jane", mediator);

        john.send("Hi there!");
        jane.send("Hey");
    }
}
