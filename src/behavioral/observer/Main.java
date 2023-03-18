package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        // Create subscribers
        JobSeeker johnDoe = new JobSeeker("John Doe");
        JobSeeker janeDoe = new JobSeeker("Jane Doe");

        // Create publisher and attach subscribers
        EmploymentAgency jobPostings = new EmploymentAgency();
        jobPostings.attach(johnDoe);
        jobPostings.attach(janeDoe);

        // Add a new job and see if subscribers get notified
        jobPostings.addJob(new JobPost("Software Engineer"));
    }
}
