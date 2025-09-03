package ControlFlow_Level1;

public class divisible {
    //Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isDivisible = (number % 5 == 0);
        System.out.printf("Is the number %d divisible by 5? %b%n", number, isDivisible);
        sc.close();
    }
    
}
