import java.util.*;

public class StudentScoreCard {
    
    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];  // 3 subjects: PCM
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, avg, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" 
                + scores[i][2] + "\t" + (int)results[i][0] + "\t" 
                + results[i][1] + "\t" + results[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        display(scores, results);
    }
}
