package ProgrammingElements_Level2;

public class square {
//     Write a program to find the side of the square whose parameter you read from the user 
// Hint => Perimeter of the Square is 4 times the side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
        sc.close();
    }

    
}
