import java.util.Scanner;

public class ToLowerDemo {
    public static String customToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = customToLower(text);
        String builtin = text.toLowerCase();

        System.out.println("Custom Lower: " + custom);
        System.out.println("Built-in Lower: " + builtin);
        System.out.println("Comparison: " + compareStrings(custom, builtin));
    }
}
