package ProgrammingElements_Level1;

public class volume {
//     Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
    public static void main(String[] args) {
        double radius = 6378;
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 * 0.239913; // 1 km^3 = 0.239913 miles^3
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
    
}
