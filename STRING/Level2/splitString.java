
import java.util.*;

public class splitString     {
    public static int stringLength(String str) {
        int count = 0;
        try { while(true) { str.charAt(count); count++; } } catch(Exception e) {}
        return count;
    }
    public static String[] customSplit(String text) {
        int n = stringLength(text);
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else word.append(c);
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] userSplit = customSplit(text);
        String[] builtInSplit = text.split(" ");
        System.out.println("Custom Split: " + Arrays.toString(userSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtInSplit));
        System.out.println("Are both same? " + compareArrays(userSplit, builtInSplit));
    }
}
