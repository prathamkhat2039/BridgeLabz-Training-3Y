import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create 2D array [number][3] -> [weight, height, BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Step 3: Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight (must be positive)
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("❌ Invalid! Weight must be positive.");
                }
            } while (weight <= 0);

            // Input height (must be positive)
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("❌ Invalid! Height must be positive.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 4: Calculate BMI = weight / (height^2)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n=== BMI Report ===");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
