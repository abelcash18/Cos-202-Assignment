// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class Vehicle {
    // Attributes
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;
    // Constructor
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false; // Vehicles are off by default
    }
    // Methods
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The engine is now running.");
        } else {
            System.out.println("The engine is already running.");
        }
    }
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The engine has been turned off.");
        } else {
            System.out.println("The engine is already off.");
        }
    }
        public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isRunning() {
        return isRunning;
    }
    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + color + ")";
    }
}