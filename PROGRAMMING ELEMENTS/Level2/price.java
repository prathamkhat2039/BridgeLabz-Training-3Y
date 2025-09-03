package ProgrammingElements_Level2;
import java.util.Scanner;
public class price {
//     Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price of the item: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity to be bought: ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
        sc.close();
    }
}
