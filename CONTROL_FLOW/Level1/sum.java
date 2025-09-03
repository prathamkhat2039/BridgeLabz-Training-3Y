package ControlFlow_Level1;

public class sum {
//     Write a program to check for the natural number and write the sum of n natural numbers 
// Hint => 
// A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
// A sum of n natural numbers is n * (n+1) / 2 
// I/P => number
// O/P => If the number is a positive integer then the output is
// The sum of ___ natural numbers is ___
// Otherwise 
// The number ___ is not a natural number
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d%n", number, sum);
        } else {
            System.out.printf("The number %d is not a natural number%n", number);
        }
        sc.close();
    }
    
}
