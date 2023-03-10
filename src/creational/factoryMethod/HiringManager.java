package creational.factoryMethod;

public abstract class HiringManager {

    // Factory method
    protected abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}