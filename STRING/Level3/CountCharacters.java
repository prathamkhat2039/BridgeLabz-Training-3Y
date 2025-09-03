import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
