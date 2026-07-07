// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class OverloadingDemo {
    // 1. Base method: accepts two integers
    public static int multiply(int a, int b) {
        return a * b;
    }
    // 2. Overloaded method: different NUMBER of parameters (three integers)
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    // 3. Overloaded method: different DATA TYPE of parameters (two doubles)
    public static double multiply(double a, double b) {
        return a * b;
    }
    // 4. Overloaded method: different ORDER of parameter types
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void displayInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Java automatically picks the right method based on the arguments
        System.out.println("Two ints: " + multiply(5, 4));          // Calls method 1
        System.out.println("Three ints: " + multiply(5, 4, 2));     // Calls method 2
        System.out.println("Two doubles: " + multiply(5.5, 2.0));   // Calls method 3
        
        System.out.println("--------------------------------------");        
        displayInfo("Joseph", 20);                                  // Calls method 4 (variant A)
        displayInfo(20, "Abel");                                    // Calls method 4 (variant B)
    }
}