package ProgrammingElements_Level1;

import java.util.Scanner;

public class yards {
//     Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance in yards is %.2f and in miles is %.2f%n", distanceInYards, distanceInMiles);
        sc.close();
    }
}
