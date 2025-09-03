import java.util.Random;

public class ZaraBonus {

    // Method to generate salary & years of service
    public static int[][] generateEmployees(int n) {
        Random rand = new Random();
        int[][] emp = new int[n][2]; // [salary, years]
        for (int i = 0; i < n; i++) {
            emp[i][0] = 10000 + rand.nextInt(90000); // random 5-digit salary
            emp[i][1] = 1 + rand.nextInt(15);        // years between 1-15
        }
        return emp;
    }

    // Method to calculate bonus & new salary
    public static double[][] calculateBonus(int[][] emp) {
        double[][] result = new double[emp.length][2]; // [newSalary, bonus]
        for (int i = 0; i < emp.length; i++) {
            double bonusRate = (emp[i][1] > 5) ? 0.05 : 0.02;
            double bonus = emp[i][0] * bonusRate;
            result[i][0] = emp[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to print report
    public static void printReport(int[][] emp, double[][] result) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n", 
                          "ID", "OldSal", "Years", "Bonus", "NewSal", "Rate");

        for (int i = 0; i < emp.length; i++) {
            sumOld += emp[i][0];
            sumNew += result[i][0];
            totalBonus += result[i][1];

            double rate = (emp[i][1] > 5) ? 5 : 2;

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f %-10.0f%%\n", 
                              i+1, emp[i][0], emp[i][1], result[i][1], result[i][0], rate);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("TOTAL: Old Salary=%.2f  New Salary=%.2f  Bonus=%.2f\n", 
                          sumOld, sumNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployees(10);
        double[][] result = calculateBonus(employees);
        printReport(employees, result);
    }
}
