import java.util.*;

public class DuplicateWordRemover {
    public static void main(String[] args) {
        String paragraph = "the quick brown fox jumps over the lazy dog the fox runs fast";
        String[] words = paragraph.split(" ");

        // HashSet: removes duplicates, no order guaranteed
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        System.out.println("Total unique words (HashSet): " + hashSet.size());
        System.out.println("HashSet contents (no guaranteed order): " + hashSet);

        // TreeSet: removes duplicates + keeps alphabetical order
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(words));
        System.out.println("Unique words in alphabetical order (TreeSet): " + treeSet);
    }
}