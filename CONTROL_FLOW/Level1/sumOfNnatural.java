import java.util.Scanner;
public class sumOfNnatural {
//     Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number >= 0) {
            // Using formula
            int formulaSum = number * (number + 1) / 2;

            // Using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= number) {
                loopSum += i;
                i++;
            }
            // Display results
            System.out.printf("Using formula: The sum of %d natural numbers is %d%n", number, formulaSum);
            System.out.printf("Using while loop: The sum of %d natural numbers is %d%n", number, loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
            }
            else {
                System.out.println("The computations do not match.");
            }
            
        }
        else {
            System.out.printf("The number %d is not a natural number%n", number);
            sc.close();
            return;
        }
    }
    
}
