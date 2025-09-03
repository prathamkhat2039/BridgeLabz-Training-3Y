import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < text.length(); j++) {
                if (i != j && text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No unique character found.");
    }
}
