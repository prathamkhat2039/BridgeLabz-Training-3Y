package ARRAYS.Level1;

import java.util.Scanner;

public class SumOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        System.out.println("Sum of all 5 numbers = " + sum);
    }
}
