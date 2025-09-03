public class countdown {
//     Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the while loop to check if the counter is 1
// Inside a while loop, print the value of the counter and decrement the counter.
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int counter = sc.nextInt();
        while (counter > 0) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
        System.out.println("Liftoff!");
        sc.close();
    }
}
