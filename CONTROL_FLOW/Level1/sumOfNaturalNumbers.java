import java.util.*;
public class sumOfNaturalNumbers {
//     Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        int formulaSum = 0;
        if (number >= 0) {
            // Using formula
           formulaSum = number * (number + 1) / 2;
        }
        // Using for loop
        int loopSum = 0;
        for(int i=1;i<=number;i++){
            loopSum += i;
        }
        // Display results
        System.out.printf("Using formula: The sum of %d natural numbers is %d%n", number, formulaSum);
        System.out.printf("Using for loop: The sum of %d natural numbers is %d%n", number, loopSum);
        if (formulaSum == loopSum) {
            System.out.println("Both computations are correct and equal.");
        }
        else {
            System.out.println("The computations do not match.");
        }
    }
    
}
