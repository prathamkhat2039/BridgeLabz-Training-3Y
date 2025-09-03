package CONTROL_FLOW.Level3;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;

        // Loop until number becomes 0
        while (temp != 0) {
            temp = temp / 10;   // remove last digit
            count++;
        }

        System.out.println("The number " + number + " has " + count + " digits.");
    }
}

    
}
