import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Step b: Find digits
        String numStr = Long.toString(num);
        int len = numStr.length();
        int[] digits = new int[len];

        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char → int
        }

        // Step c: Frequency array
        int[] freq = new int[10];  // index = digit, value = count
        for (int d : digits) {
            freq[d]++;
        }

        // Step d: Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
