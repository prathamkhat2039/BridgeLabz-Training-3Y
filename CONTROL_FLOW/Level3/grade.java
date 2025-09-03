package CONTROL_FLOW.Level3;
import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // Calculate average percentage
        double average = (physics + chemistry + maths) / 3.0;

        // Decide grade and remarks
        String grade, remarks;
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("\n--- RESULT ---");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

    
}
