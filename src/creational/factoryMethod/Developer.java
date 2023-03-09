package creational.factoryMethod;

public class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Ask about design patterns");
    }
}
