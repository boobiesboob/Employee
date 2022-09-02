public class Work {

    private Employee employee;

    public Work(){
        employee = new Employee("roma", "kap", 100);
    }

    public double increaseSalaray(){
        employee.setSalary(20000);
        return employee.getSalary();
    }
}
