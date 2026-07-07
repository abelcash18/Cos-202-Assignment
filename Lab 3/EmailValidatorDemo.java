// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorDemo {
    // A comprehensive regex pattern for standard email formats
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";    
    // Compile the pattern once to optimize performance
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        } 
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testEmails = {
            "josephabel540@gmail.com",
            "developer.john@domain.co.uk",
            "invalid-email.com",      // Missing @
            "test@domain",            // Missing top-level domain extension (.com, .net, etc.)
            "user@.com",              // Missing domain name
            "james@domain..com"       // Double dots in domain
        };

        System.out.println("--- Email Validation Results ---");
        for (String email : testEmails) {
            System.out.printf("%-30s : %s%n", email, isValidEmail(email) ? "VALID" : "INVALID");
        }
    }
}