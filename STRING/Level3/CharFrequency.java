import java.util.Scanner;

public class CharFrequency {

    // Method to find frequency of characters using charAt()
    public static int[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII range

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Store in 2D array [char, frequency]
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = ch;       // store ASCII value of char
                result[index][1] = freq[ch]; // store frequency
                freq[ch] = 0; // to avoid duplicates
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Method call
        int[][] frequencyArray = findFrequency(text);

        // Output
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println((char)frequencyArray[i][0] + " → " + frequencyArray[i][1]);
        }
    }
}
