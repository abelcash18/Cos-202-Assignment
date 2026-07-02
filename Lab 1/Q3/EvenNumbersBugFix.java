// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

import java.util.Scanner;
public class EvenNumbersBugFix {
    // Buggy version intentionally prints the first n even numbers with a mistake.
    // Mistake: it starts at 0 instead of 2 (and therefore prints one extra incorrect value for n).
    public static void printFirstNEvensBuggy(int n) {
        int count = 0;
        for (int i = 0; count < n; i += 2) { // breakpoint here
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
    }
    // Correct version: starts at 2.
    public static void printFirstNEvensFixed(int n) {
        int count = 0;
        for (int i = 2; count < n; i += 2) { // breakpoint here
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Buggy output: ");
        printFirstNEvensBuggy(n);

        System.out.print("Fixed output: ");
        printFirstNEvensFixed(n);
    }
}