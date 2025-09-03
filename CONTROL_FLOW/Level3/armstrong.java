package CONTROL_FLOW.Level3;
    import java.util.Scanner;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;  // Keep copy for checking later
        int sum = 0;

        // While loop to extract each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // Get last digit
            sum += digit * digit * digit;      // Add cube of digit to sum
            originalNumber /= 10;              // Remove last digit
        }

        // Check Armstrong condition
        if (sum == number)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is NOT an Armstrong Number");
    }
}

    
}
