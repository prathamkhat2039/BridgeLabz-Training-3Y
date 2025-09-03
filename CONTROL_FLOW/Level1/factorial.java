import java.util.Scanner;

public class factorial {
//     Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.
    public static void main(Srring [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();  
        if (number < 0) {
            System.out.println("The number is not a positive integer.");
            sc.close();
            return;
        }
        int fact = 1;
        int i = 1;  
        while (i <= number) {
            fact*=i;
            i++;
        }
        System.out.printf("The factorial of %d is %d%n", number, fact);
        sc.close();
    }
    
}
