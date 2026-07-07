// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class Car1 extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;

    // Constructor passing core details to the parent class via super()
    public Car1(String manufacturer, String model, int productionYear, int numberOfDoors, boolean isElectric) {
        super (manufacturer, model, productionYear);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo () {
        // 1. Call the parent class version to handle manufacturer, model, and year
        super.displayInfo (); 
        
        // 2. Print the unique attributes specific to the Car class
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Electric: " + (isElectric ? "Yes" : "No"));
    }
}