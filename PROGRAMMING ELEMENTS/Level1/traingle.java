package ProgrammingElements_Level1;

public class traingle {
// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = sc.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters%n", areaInches, areaCm);
        sc.close();
    }
    
}   
