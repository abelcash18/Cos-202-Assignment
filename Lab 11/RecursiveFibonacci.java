// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        for (int i = 0; < 10;i++){
      System.out.println(fibonacci(i)+"");
        }
    }
    
}
