package behavioral.command;

public class TurnOff implements Command {

    private final Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
