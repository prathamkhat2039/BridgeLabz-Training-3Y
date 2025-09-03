import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step b: Create arrays
        int[][] marks = new int[n][3];       // 3 subjects per student
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step c: Take input of marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int m;
                do {
                    System.out.print("Enter marks in " + subject + " (0-100): ");
                    m = sc.nextInt();

                    if (m < 0 || m > 100) {
                        System.out.println("❌ Invalid! Enter a value between 0 and 100.");
                    }
                } while (m < 0 || m > 100);

                marks[i][j] = m;
            }

            // Step d: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step e: Assign grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Step f: Display results
        System.out.println("\n=== Student Report ===");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < n; i++) {
            String remarks;
            switch (grade[i]) {
                case 'A':
                    remarks = "Level 4 (above standards)";
                    break;
                case 'B':
                    remarks = "Level 3 (at standards)";
                    break;
                case 'C':
                    remarks = "Level 2 (approaching)";
                    break;
                case 'D':
                    remarks = "Level 1 (below)";
                    break;
                case 'E':
                    remarks = "Level 1- (too below)";
                    break;
                default:
                    remarks = "Remedial standards";
            }

            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c %-20s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], remarks);
        }

        sc.close();
    }
}
