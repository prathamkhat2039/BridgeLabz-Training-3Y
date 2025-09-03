public class NumberChecker {

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

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int pow = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, pow);
        return sum == n;
    }

    public static void largestAndSecondLargest(int n) {
        int[] digits = getDigits(n);
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    public static void smallestAndSecondSmallest(int n) {
        int[] digits = getDigits(n);
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Duck? " + isDuck(number));
        System.out.println("Armstrong? " + isArmstrong(number));
        largestAndSecondLargest(number);
        smallestAndSecondSmallest(number);
    }
}
