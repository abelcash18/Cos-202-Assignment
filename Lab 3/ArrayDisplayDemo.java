// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

import java.util.Arrays;

public class ArrayDisplayDemo {

    public static void main(String[] args) {
        // ===================================================
        // 1. Using Arrays.toString() for 1D Arrays
        // ===================================================
        String[] technologies = {"React", "Node.js", "Tailwind", "Java"};
        
        System.out.println("--- 1D Array Printing ---");
        System.out.println("Direct Print: " + technologies); 
        System.out.println("Arrays.toString(): " + Arrays.toString(technologies));
        
        System.out.println("\n---------------------------------------------------\n");

        // ===================================================
        // 2. Using Arrays.deepToString() for 2D/Multi-Dimensional Arrays
        // ===================================================
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("--- 2D Array Printing ---");
        System.out.println("Direct Print: " + matrix); 
        System.out.println("Arrays.toString(): " + Arrays.toString(matrix)); 
        System.out.println("Arrays.deepToString(): " + Arrays.deepToString(matrix));
    }
}