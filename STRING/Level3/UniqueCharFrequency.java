import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        String unique = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;

            // Check if 'ch' already appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique += ch; // add only first occurrence
            }
        }

        return unique.toCharArray(); // return unique chars as array
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency storage

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 3: Create 2D String array [char, frequency]
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Method call
        String[][] frequencyArray = findFrequency(text);

        // Output
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + " → " + frequencyArray[i][1]);
        }
    }
}
