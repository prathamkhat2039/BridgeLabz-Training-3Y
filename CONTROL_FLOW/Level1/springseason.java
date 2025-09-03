
public class springseason {
//     Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        boolean isSpring = false;
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            isSpring = true;
        }
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        }
        else {
            System.out.println("Not a Spring Season.");
        }
    }
    
}
