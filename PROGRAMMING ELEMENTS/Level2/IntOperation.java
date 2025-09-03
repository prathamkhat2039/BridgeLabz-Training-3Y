package ProgrammingElements_Level2;
import java.util.Scanner;
public class IntOperation {
//     Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, and c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign the result to a variable
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.printf("The results of the operations are: a + b * c = %d, a * b + c = %d, c + a / b = %d, and a %% b + c = %d%n", result1, result2, result3, result4);
        input.close();
    }
    
}
