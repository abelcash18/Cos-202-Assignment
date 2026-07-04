public abstract class Employee {
    // Shared attributes for all employees
    private String name;
    private int id;
    private String department;

    // Constructor
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Abstract method: Every subclass MUST implement its own version of this
    public abstract double calculateSalary();

    // Concrete method: Shared logic that subclasses can use as-is
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name:        " + name);
        System.out.println("Department:  " + department);
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}