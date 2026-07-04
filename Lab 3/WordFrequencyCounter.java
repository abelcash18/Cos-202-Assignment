import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "The MERN stack is great, but Java is also great for backend engineering.";
        
        System.out.println("--- Input Text ---");
        System.out.println('"' + text + '"');
        
        // 1. Define delimiters: space, period, comma, exclamation, and question mark
        String delimiters = " .,!?";
        
        // 2. Initialize the StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(text, delimiters);
        
        // 3. Create a Map to store word frequencies (Word -> Count)
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // 4. Process each token sequentially
        while (tokenizer.hasMoreTokens()) {
            // Grab the next token and normalize it to lowercase
            String word = tokenizer.nextToken().toLowerCase();
            
            // If the word exists, increment its count; otherwise, initialize it at 1
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        
        // 5. Display the results nicely
        System.out.println("\n--- Word Frequencies ---");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.printf("%-12s : %d%n", entry.getKey(), entry.getValue());
        }
    }
}