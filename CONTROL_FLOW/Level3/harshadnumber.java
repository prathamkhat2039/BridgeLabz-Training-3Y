package CONTROL_FLOW.Level3;

import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Step: Calculate sum of digits
        while (temp > 0) {
            int digit = temp % 10;   // get last digit
            sum += digit;            // add digit to sum
            temp /= 10;              // remove last digit
        }

        // Step: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}