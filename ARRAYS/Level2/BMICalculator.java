import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step b: Create arrays to store weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step c: Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();

            // Step d: Calculate BMI = weight / (height^2)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine status using given table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step e: Display results
        System.out.println("\n=== BMI Report ===");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weight[i], height[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
