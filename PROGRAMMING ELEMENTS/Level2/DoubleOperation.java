package ProgrammingElements_Level2;

public class DoubleOperation {
    // Similarly, write the DoubleOpt program by taking double values and doing the same operations.
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.printf("The results of the operations are: a + b * c = %.2f, a * b + c = %.2f, c + a / b = %.2f, and a %% b + c = %.2f%n", result1, result2, result3, result4);
        sc.close();
    }
    
}
