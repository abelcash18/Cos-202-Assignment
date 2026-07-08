// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

interface Payable {
    double getPaymentAmount();
}

// Entity 1: Employee
class Employee implements Payable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
// Entity 2: Invoice (unrelated to Employee, but still Payable)
class Invoice implements Payable {
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}