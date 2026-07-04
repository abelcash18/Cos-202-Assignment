public class Main {
    public static void main(String[] args) {
        // 1. Animals
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");
        myDog.makeSound();
        myCat.makeSound();

        System.out.println("---");

        // 2. Shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        System.out.println("---");

        // 3. Payable Entities
        Payable employee = new Employee("Alice", 5000.0);
        Payable invoice = new Invoice("Part-404", 3, 25.0);
        System.out.println("Employee Payment: $" + employee.getPaymentAmount());
        System.out.println("Invoice Total: $" + invoice.getPaymentAmount());

        System.out.println("---");

        // 4. Multiple Interfaces
        SmartPet roboDog = new SmartPet("Sparky");
        roboDog.printDetails();
        roboDog.eat();
    }
}