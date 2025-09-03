package CONTROL_FLOW.Level3;
import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;  // Assume prime by default

        if (number <= 1) {
            isPrime = false;  // Prime numbers must be > 1
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {   // divisible by some other number
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is NOT a Prime Number");
    }
}

    
}
