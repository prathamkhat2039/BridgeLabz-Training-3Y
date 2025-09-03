package ProgrammingElements_Level2;


public class traingle {
//     Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters%n", areaInches, areaCm);
        sc.close();
    }

    
}
