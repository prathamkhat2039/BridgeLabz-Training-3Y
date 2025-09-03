public class NumberChecker4 {
    
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        int[] rev = reverseDigits(digits);
        return compareArrays(digits, rev);
    }

    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.substring(1).contains("0");
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Duck: " + isDuck(num));
    }
}
