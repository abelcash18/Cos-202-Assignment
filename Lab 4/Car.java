public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;

    // Constructor using 'super' to pass data to the Vehicle class
    public Car(String manufacturer, String model, int productionYear, String color, int numberOfDoors, boolean isElectric) {
        super(manufacturer, model, productionYear, color);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    // Overriding the display method to add Car-specific details on separate lines
    @Override
    public void displayInfo() {
        super.displayInfo(); // Prints manufacturer, model, and year
        System.out.println("Color: " + getColor());
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Electric: " + (isElectric ? "Yes" : "No"));
    }

    // Getters and Setters specific to Car
    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
    public boolean isElectric() { return isElectric; }
    public void setElectric(boolean electric) { isElectric = electric; }
}