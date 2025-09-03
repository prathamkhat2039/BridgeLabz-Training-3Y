package CONTROL_FLOW.Level3;

import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input weight (kg) and height (cm)
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters (since BMI = kg/m^2)
        double heightM = heightCm / 100;

        // Step b: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step c: Determine status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
    }
}
