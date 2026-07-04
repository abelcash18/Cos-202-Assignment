import java.util.Arrays;

public class ArrayDisplayDemo {

    public static void main(String[] args) {
        
        // ===================================================
        // 1. Using Arrays.toString() for 1D Arrays
        // ===================================================
        String[] technologies = {"React", "Node.js", "Tailwind", "Java"};
        
        System.out.println("--- 1D Array Printing ---");
        // Wrong way: Prints the object reference hashcode
        System.out.println("Direct Print: " + technologies); 
        
        // Correct way: Prints the actual elements cleanly
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
        // Wrong way 1: Prints the top-level row references hashcode
        System.out.println("Direct Print: " + matrix); 
        
        // Wrong way 2: Only prints the references of the inner nested arrays
        System.out.println("Arrays.toString(): " + Arrays.toString(matrix)); 
        
        // Correct way: Recursively travels inside the nested elements to print everything
        System.out.println("Arrays.deepToString(): " + Arrays.deepToString(matrix));
    }
}