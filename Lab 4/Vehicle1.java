public class Vehicle1  {
    // Attributes
    private String manufacturer; // Updated from 'make' to match your request
    private String model;
    private int productionYear;  // Updated from 'year' to match your request
    private String color;
    private boolean isRunning;

    // Constructor
    public Vehicle1(String manufacturer, String model, int productionYear, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.isRunning = false;
    }

    // New method to display the vehicle's specific info
    public void displayInfo() {
        System.out.println("--- Vehicle Information ---");
        System.out.println("Manufacturer:    " + manufacturer);
        System.out.println("Model:           " + model);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Color:           " + color);
        System.out.println("Engine Status:   " + (isRunning ? "Running" : "Off"));
        System.out.println("---------------------------");
    }

    // Engine control methods
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

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
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
}