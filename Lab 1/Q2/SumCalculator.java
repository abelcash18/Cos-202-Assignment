// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
//Course: Cos 202

public class SumCalculator {
    public static int computeSum(int n) {
        int total = 0;
        // i will go from 1 up to n
        for (int i = 1; i <= n; i++) {
            total += i;  // <- Breakpoint placed here
        }
        return total;
    }

    public static void main(String[] args) {
        // Example execution
        computeSum(5);
    }
}