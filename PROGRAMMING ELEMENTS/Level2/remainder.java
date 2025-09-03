package ProgrammingElements_Level2;

public class remainder {
//     Write a program to take 2 numbers and print their quotient and reminder
// Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt(); 
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n", quotient, remainder, number1, number2);
        sc.close();
    }

    
}
