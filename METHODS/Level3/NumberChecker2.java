public class NumberChecker2 {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumOfDigits(n) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 21;
        System.out.println("Harshad? " + isHarshad(number));

        int[][] freq = digitFrequency(212345);
        System.out.println("Digit frequencies:");
        for (int[] f : freq) {
            if (f[1] > 0)
                System.out.println("Digit " + f[0] + ": " + f[1]);
        }
    }
}
