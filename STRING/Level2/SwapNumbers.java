
import java.util.*;

public class SwapNumbers.java
 {
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println("Length without length(): " + stringLength(str));
        System.out.println("Length with length(): " + str.length());
    }
}
