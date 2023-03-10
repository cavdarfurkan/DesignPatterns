package structural.composite;

public class Designer implements Employee {

    protected float salary;
    protected String name;
    protected String[] roles;


    public Designer(String name, Float salary) {
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
