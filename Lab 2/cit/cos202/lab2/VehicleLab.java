package cit.cos202.lab2;

public class VehicleLab {
    public static void main(String[] args) {
        // Create 3 vehicle objects using different constructors
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2022, 15000, 35, 50);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2020, 45000, 47); // Convenience constructor (0L fuel)
        Vehicle v3 = new Vehicle("Ford", "F-150", 2024, 500, 80, 98);

        System.out.println("--- Initial State ---");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println("Total Vehicles Created: " + Vehicle.getTotalVehiclesCreated());
        System.out.println();

        // --- Operations on Vehicle 1 ---
        System.out.println("--- Testing Vehicle 1 (Toyota) ---");
        v1.drive(200); // 200km * 0.07 = 14L consumed
        System.out.println("After driving: " + v1);
        v1.refuel(20); // Add 20L
        System.out.println("After refuelling: " + v1);
        System.out.println();

        // --- Operations on Vehicle 2 ---
        System.out.println("--- Testing Vehicle 2 (Honda - Starts Empty) ---");
        v2.drive(50); // Should fail / run out of gas instantly
        v2.refuel(40); // Refuel to allow driving
        System.out.println("After refuelling: " + v2);
        v2.drive(100); // Consumes 7L
        System.out.println("After driving: " + v2);
        System.out.println();

        // --- Operations on Vehicle 3 ---
        System.out.println("--- Testing Vehicle 3 (Ford) ---");
        v3.drive(1200); // Long distance to test running empty midpoint
        System.out.println("After exhausting fuel: " + v3);
        System.out.println();

        // --- Testing Global Reset Counter Safely ---
        System.out.println("--- Testing Static Counter Reset ---");
        System.out.println("Vehicles before reset: " + Vehicle.getTotalVehiclesCreated());
        Vehicle.resetCounter();
        System.out.println("Vehicles after reset: " + Vehicle.getTotalVehiclesCreated());
    }
}

