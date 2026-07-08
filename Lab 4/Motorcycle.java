// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private String handlebarType; // e.g., "Cruiser", "Sport", "Ape Hangers"
    // Constructor passing core details to the parent Vehicle class via super()
    public Motorcycle(String manufacturer, String model, int productionYear, String color, boolean hasSidecar, String handlebarType) {
        super(manufacturer, model, productionYear, color);
        this.hasSidecar = hasSidecar;
        this.handlebarType = handlebarType;
    }
    // Overriding the displayInfo method to add motorcycle-specific details
    @Override
    public void displayInfo() {
        // 1. Call the parent class version to handle manufacturer, model, and year
        super.displayInfo();        
        // 2. Print the unique attributes specific to the Motorcycle class
        System.out.println("Color: " + getColor());
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Handlebar Type: " + handlebarType);
    }
    // Getters and Setters
    public boolean isHasSidecar() {
        return hasSidecar;
    }
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public String getHandlebarType() {
        return handlebarType;
    }

    public void setHandlebarType(String handlebarType) {
        this.handlebarType = handlebarType;
    }
}