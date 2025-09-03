public class factorial_loop {
//     Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();0
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else {
            long factorial = 1; 
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Calculate factorial

            }
            System.out.printf("The factorial of %d is %d%n", number, factorial);
        }
    }
}
