public class PassByValueDemo {

    // Simple Object class to demonstrate references
    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        // ==========================================
        // 1. DEMONSTRATING PRIMITIVES
        // ==========================================
        int originalPrimitive = 10;
        System.out.println("Before primitive method: " + originalPrimitive); // 10
        
        modifyPrimitive(originalPrimitive);
        
        // The original value remains unchanged because only a copy was altered
        System.out.println("After primitive method: " + originalPrimitive); // 10
        System.out.println("--------------------------------------");

        // ==========================================
        // 2. DEMONSTRATING REFERENCES
        // ==========================================
        Person originalPerson = new Person("Joseph");
        System.out.println("Before reference method: " + originalPerson.name); // Joseph
        
        modifyReference(originalPerson);
        
        // The object's internal state was changed because the method pointed to the same object
        System.out.println("After reference method: " + originalPerson.name); // Abel
    }

    // Accepts a copy of the primitive value
    public static void modifyPrimitive(int number) {
        number = 50; // Changing this copy does not affect the original variable in main
    }

    // Accepts a copy of the memory address pointer
    public static void modifyReference(Person person) {
        person.name = "Abel"; // Changes the object that the copy points to
        
        // Note: If we reassign the reference itself, it cuts the tie to the original object:
        // person = new Person("New Name"); // This would NOT affect originalPerson in main
    }
}