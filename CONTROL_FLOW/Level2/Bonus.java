package CONTROL_FLOW.Level2;

// Write a program to calculate the bonus for an employee based on their salary and years of service.
// If the years of service is more than 5, the bonus is 5% of the salary.
// Otherwise, there is no bonus.
import java.util.*;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus!");
        }
    }
}
