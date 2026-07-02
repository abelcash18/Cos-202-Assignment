import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total = 0; // running sum of 1..i
        int i = 1;

        while (i <= n) {
            // Breakpoint: place cursor here on the next line
            total = total + i;
            i = i + 1;
        }

        System.out.println("Sum 1 + 2 + ... + " + n + " = " + total);
    }
}

