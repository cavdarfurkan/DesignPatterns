package structural.composite;

public class Developer implements Employee {

    protected float salary;
    protected String name;
    protected String[] roles;


    public Developer(String name, Float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public String[] getRoles() {
        return roles;
    }
}
