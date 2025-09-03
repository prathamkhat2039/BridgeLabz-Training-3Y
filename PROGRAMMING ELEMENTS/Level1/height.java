package ProgrammingElements_Level1;
import java.util.*;
class height {
//     Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height");
        double h=sc.nextDouble();
        double inch=h/2.54;
        double foot=inch/12;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",h,inch,foot);
    } 
}
