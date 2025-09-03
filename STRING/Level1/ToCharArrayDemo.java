import java.util.Scanner;

public class ToCharArrayDemo {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Custom array: " + String.valueOf(arr1));
        System.out.println("Built-in array: " + String.valueOf(arr2));
        System.out.println("Comparison result: " + compareArrays(arr1, arr2));
    }
}
