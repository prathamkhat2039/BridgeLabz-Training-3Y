package METHODS.Level2;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfPersons = 10;
        double[][] personData = new double[numberOfPersons][3]; // col-0: weight, col-1: height, col-2: BMI
        String[] bmiStatus = new String[numberOfPersons];

        // Input
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            // weight input
            double weight;
            do {
                System.out.print("Weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Please enter positive weight.");
            } while (weight <= 0);

            // height input
            double height;
            do {
                System.out.print("Height (cm): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Please enter positive height.");
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = calculateBMI(weight, height);
            personData[i][2] = bmi;

            // Store BMI status
            bmiStatus[i] = getBMIStatus(bmi);
        }

        // Display
        System.out.println("\n--- BMI Report for 10 Persons ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}
