import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to m
        return weight / (heightM * heightM);
    }

    // Method to get BMI Status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // Method to compute BMI and status for all members
    public static String[][] computeBMI(double[][] arr) {
        int n = arr.length;
        String[][] result = new String[n][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = arr[i][0];
            double height = arr[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display result in table format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] inputArr = new double[10][2]; // 10 rows, 2 columns (weight, height)

        System.out.println("Enter Weight (kg) and Height (cm) of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            inputArr[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            inputArr[i][1] = sc.nextDouble();
        }

        String[][] resultArr = computeBMI(inputArr);
        displayTable(resultArr);
    }
}
