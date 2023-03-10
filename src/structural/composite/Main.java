package structural.composite;

public class Main {
    public static void main(String[] args) {
        // Prepare the employees
        Employee employee1 = new Developer("John Doe", 1000f);
        Employee employee2 = new Designer("Jane Doe", 2000f);

        // Add them to organization
        Organization organization = new Organization();
        organization.addEmployee(employee1);
        organization.addEmployee(employee2);

        System.out.println("Net salaries: " + organization.getNetSalaries());
    }
}
