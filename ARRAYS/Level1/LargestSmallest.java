package ARRAYS.Level1;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
    }
}
