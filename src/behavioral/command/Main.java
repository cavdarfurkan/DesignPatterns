package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();

        Command turnOn = new TurnOn(bulb);
        Command turnOff = new TurnOff(bulb);

        RemoteControl remote = new RemoteControl();
        remote.submit(turnOn);
        remote.submit(turnOff);
    }
}
