package CONTROL_FLOW.Level2;

import java.util.Scanner;

public class multitable {
    //     Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        sc.close();
    }
}

}
