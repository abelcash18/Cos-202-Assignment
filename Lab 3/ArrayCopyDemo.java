import java.util.Arrays;

public class ArrayCopyDemo {

    // Method to manually copy an integer array
    public static int[] manualArrayCopy(int[] sourceArray) {
        // 1. Handle edge case for null arrays
        if (sourceArray == null) {
            return null;
        }

        // 2. Create a new array with the exact same length
        int[] destinationArray = new int[sourceArray.length];

        // 3. Manually loop through and duplicate each element
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        return destinationArray;
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        // Perform the manual copy
        int[] copy = manualArrayCopy(original);

        // Verify that they have the same contents
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Array:   " + Arrays.toString(copy));

        // Prove that changing the copy doesn't alter the original (Deep Copy)
        copy[0] = 999;
        System.out.println("\n--- After modifying copy[0] ---");
        System.out.println("Original Array: " + Arrays.toString(original)); // Remains 10
        System.out.println("Copied Array:   " + Arrays.toString(copy));     // Becomes 999
    }
}