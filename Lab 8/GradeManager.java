import java.util.*;

public class GradeManager {
    static HashMap<String, ArrayList<Integer>> grades = new HashMap<>();

    static void addScore(String id, int score) {
        if (!grades.containsKey(id)) {
            grades.put(id, new ArrayList<>());
        }
        grades.get(id).add(score);
    }

    static double calculateAverage(String id) {
        if (!grades.containsKey(id) || grades.get(id).isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int s : grades.get(id)) {
            sum += s;
        }
        return (double) sum / grades.get(id).size();
    }

    static void printAllAverages() {
        for (String id : grades.keySet()) {
            System.out.printf("Student %s -> Average: %.2f%n", id, calculateAverage(id));
        }
    }

    public static void main(String[] args) {
        addScore("s001", 85);
        addScore("s001", 90);
        addScore("s001", 78);
        addScore("s002", 60);
        addScore("s002", 70);
        addScore("s003", 95);
        
        printAllAverages();
    }
}