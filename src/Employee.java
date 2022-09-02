public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastname, double salary) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
