package behavioral.observer;

import java.util.ArrayList;

public class EmploymentAgency {

    private final ArrayList<JobSeeker> observers = new ArrayList<>();

    private void notify(JobPost jobPosting) {
        for (JobSeeker observer : observers) {
            observer.onJobPosted(jobPosting);
        }
    }

    public void attach(JobSeeker observer) {
        this.observers.add(observer);
    }

    public void addJob(JobPost jobPosting) {
        this.notify(jobPosting);
    }
}
