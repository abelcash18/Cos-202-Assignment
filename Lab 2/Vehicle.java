package cit.cos202.lab2;

public class Vehicle {
    // Private instance fields
    private String make;
    private String model;
    private int year;
    private double odometer;
    private double fuelLevel;
    private double fuelCapacity;

    // Static field to track total vehicles created
    private static int totalVehiclesCreated = 0;

    // Full constructor
    public Vehicle(String make, String model, int year, double odometer, double fuelLevel, double fuelCapacity) {
        this.make = make;
        this.model = model;
        setYear(year);
        setOdometer(odometer);
        this.fuelCapacity = fuelCapacity; // Set capacity first to validate fuel level
        setFuelLevel(fuelLevel);
        
        totalVehiclesCreated++;
    }

    // Convenience constructor (sets fuelLevel to 0)
    public Vehicle(String make, String model, int year, double odometer, double fuelCapacity) {
        this(make, model, year, odometer, 0.0, fuelCapacity);
    }

    // --- Validation and Setters ---

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year < 1886 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1886 and " + currentYear);
        }
        this.year = year;
    }

    public void setOdometer(double odometer) {
        if (odometer < this.odometer) {
            throw new IllegalArgumentException("Odometer reading cannot decrease.");
        }
        this.odometer = odometer;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0) {
            this.fuelLevel = 0;
        } else if (fuelLevel > this.fuelCapacity) {
            throw new IllegalArgumentException("Fuel level cannot exceed fuel capacity (" + this.fuelCapacity + "L).");
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    // --- Getters ---

    public double getOdometer() {
        return this.odometer;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public static int getTotalVehiclesCreated() {
        return totalVehiclesCreated;
    }

    // --- Core Methods ---

    // Refuel method
    public void refuel(double litres) {
        if (litres < 0) {
            System.out.println("Cannot refuel a negative amount.");
            return;
        }
        setFuelLevel(this.fuelLevel + litres);
    }

    // Drive method (consumes 7L / 100km -> 0.07L per km)
    public void drive(double km) {
        if (km < 0) {
            System.out.println("Cannot drive a negative distance.");
            return;
        }
        
        double fuelRequired = km * (7.0 / 100.0);

        if (fuelRequired <= this.fuelLevel) {
            setOdometer(this.odometer + km);
            setFuelLevel(this.fuelLevel - fuelRequired);
            System.out.printf("Successfully drove %.1f km.\n", km);
        } else {
            // Drive as far as the remaining fuel allows
            double maxKm = this.fuelLevel / (7.0 / 100.0);
            setOdometer(this.odometer + maxKm);
            setFuelLevel(0);
            System.out.printf("Out of gas! Only managed to drive %.1f km out of %.1f km.\n", maxKm, km);
        }
    }

    // --- Step 6: Counter Reset ---
    
    /**
     * Resets the total vehicles created counter back to 0.
     * 
     * DISCUSSION ON WHY THIS IS DANGEROUS IN PRODUCTION:
     * Resetting global static counters breaks data integrity and state tracking across an application. 
     * If other parts of a production system rely on this counter for unique ID generation, memory auditing, 
     * analytics, or object lifecycle management, resetting it creates a mismatch between reality and tracking. 
     * Active vehicle objects will still exist in memory, but the system will incorrectly report that 0 exist, 
     * potentially causing memory leaks, duplicate identifier bugs, or broken telemetry reports.
     */
    public static void resetCounter() {
        totalVehiclesCreated = 0;
    }

    // --- Step 4: toString() Implementation ---
    @Override
    public String toString() {
        return String.format("[%d %s %s] Odometer: %.1fkm | Fuel: %.1fL/%.1fL", 
                year, make, model, odometer, fuelLevel, fuelCapacity);
    }
}