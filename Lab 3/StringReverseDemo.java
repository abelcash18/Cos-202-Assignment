// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

public class StringReverseDemo {

    public static String reverseWithBuilder(String original) {
        if (original == null) {
            return null;
        }
        // 1. Initialize a mutable StringBuilder with the original string
        StringBuilder builder = new StringBuilder(original);
        // 2. Perform the in-place mutable reversal
        builder.reverse();
        // 3. Convert the mutable buffer back into an immutable String
        return builder.toString();
    }

    public static void main(String[] args) {
        String forwardText = "MERN Stack & Java";        
        // Reverse the string
        String reversedText = reverseWithBuilder(forwardText);
        
        System.out.println("Original String: " + forwardText);
        System.out.println("Reversed String: " + reversedText);
    }
}