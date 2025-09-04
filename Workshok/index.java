import java.util.*;

public class index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] borrowings = new int[7];
        for (int i = 0; i < 7; i++) borrowings[i] = sc.nextInt();

        int total = 0, maxBorrowed = borrowings[0], maxDay = 1;
        boolean holiday = false;
        for (int i = 0; i < 7; i++) {
            total += borrowings[i];
            if (borrowings[i] > maxBorrowed) { maxBorrowed = borrowings[i]; maxDay = i + 1; }
            if (borrowings[i] == 0) holiday = true;
        }
        double avg = total / 7.0;

        System.out.println("Total: " + total);
        System.out.println("Highest: Day " + maxDay + " (" + maxBorrowed + ")");
        System.out.println(holiday ? "Holiday occurred" : "No holidays");
        System.out.printf("Average: %.2f\n", avg);
    }
}
