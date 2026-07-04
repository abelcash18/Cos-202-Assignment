public class VarargsExample {

    // Method that accepts a variable number of integers
    public static int calculateSum(int... numbers) {
        int sum = 0;
        
        // Treat 'numbers' as a standard array
        for (int num : numbers) {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // You can call it with any number of arguments:
        System.out.println("Sum of 0 numbers: " + calculateSum()); 
        System.out.println("Sum of 3 numbers: " + calculateSum(5, 10, 15)); 
        System.out.println("Sum of 5 numbers: " + calculateSum(1, 2, 3, 4, 5)); 
        
        // You can also pass an actual array directly:
        int[] myNumbers = {10, 20, 30};
        System.out.println("Sum of array: " + calculateSum(myNumbers));
    }
}