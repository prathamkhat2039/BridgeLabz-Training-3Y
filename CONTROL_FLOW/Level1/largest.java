package ControlFlow_Level1;

public class largest {
//     Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___ 
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);
        System.out.printf("Is the first number the largest? %b%n", isFirstLargest);
        System.out.printf("Is the second number the largest? %b%n", isSecondLargest);
        System.out.printf("Is the third number the largest? %b%n", isThirdLargest);
        sc.close();
    }
    
}
