package CONTROL_FLOW.Level3;
import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Step: Find divisors and add them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // add divisor
            }
        }

        // Step: Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}

    
}
