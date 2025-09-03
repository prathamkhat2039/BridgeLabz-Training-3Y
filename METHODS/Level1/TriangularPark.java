import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        System.out.println("Rounds required = " + calculateRounds(a, b, c));
    }
}
