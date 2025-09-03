import java .util.*;
// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("The number is not a natural number.");
            sc.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d is an even number.%n", i);
            } else {
                System.out.printf("%d is an odd number.%n", i);
            }
        }
    }    
}

