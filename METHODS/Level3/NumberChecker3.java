import java.util.*;

public class NumberChecker3 {

    // ---------- Digits Related ----------
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

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        int[] rev = reverseArray(digits);
        return arraysEqual(digits, rev);
    }

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // ---------- Prime, Neon, Spy, Automorphic, Buzz ----------
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        int[] digits = getDigits(n);
        for (int d : digits) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        String sq = String.valueOf(n * n);
        return sq.endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    // ---------- Perfect, Abundant, Deficient, Strong ----------
    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n && n != 1;
    }

    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        w
