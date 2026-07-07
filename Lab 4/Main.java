// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class Main {
    public static void main(String[] args) {
        // Employee emp = new Employee(...); // Error! Cannot instantiate an abstract class.

        Employee developer = new FullTimeEmployee("Alice", 101, "Engineering", 8000.0);
        Employee contractor = new HourlyEmployee("Bob", 102, "Design", 50.0, 160);

        System.out.println("--- Developer Info ---");
        developer.displayInfo();
        System.out.println("Calculated Salary: $" + developer.calculateSalary());

        System.out.println("\n--- Contractor Info ---");
        contractor.displayInfo();
        System.out.println("Calculated Salary: $" + contractor.calculateSalary());
    }
}