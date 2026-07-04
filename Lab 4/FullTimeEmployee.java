public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, String department, double monthlySalary) {
        super(name, id, department);
        this.monthlySalary = monthlySalary;
    }

    // Implementing the required abstract method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}