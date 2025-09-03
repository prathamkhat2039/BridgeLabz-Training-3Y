package ProgrammingElements_Level1;

import java.util.Scanner;

public class handshakes {
//     Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.
// I/P => numberOfStudents
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("The maximum number of handshakes among %d students is %d%n", numberOfStudents, handshakes);
        sc.close();
    }

    
}
