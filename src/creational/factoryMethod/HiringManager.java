package creational.factoryMethod;

public abstract class HiringManager {

    // Factory method
    protected abstract Interviewer makeInterviewer();

    public Interviewer takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();

        return interviewer;
    }
}
