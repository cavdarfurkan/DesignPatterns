package behavioral.command;

public class TurnOn implements Command {

    private final Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOn();
    }

    @Override
    public void undo() {
        bulb.turnOff();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
