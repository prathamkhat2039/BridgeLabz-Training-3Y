
// Rewrite program 8 to do the countdown using the for-loop
// I/P => number
// O/P => Countdown from the number to 1, then print "Liftoff!"
public class countdownforloop {
    //Rewrite program 8 to do the countdown using the for-loop
    public static void main(String[] args) {    
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Liftoff!");
        sc.close();
    }
    
}
