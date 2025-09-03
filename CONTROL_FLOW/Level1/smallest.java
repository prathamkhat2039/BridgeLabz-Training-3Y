package ControlFlow_Level1;

public class smallest {
//     Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt(); 
        boolean isSmallest = (number1 < number2 && number1 < number3);

    
}
