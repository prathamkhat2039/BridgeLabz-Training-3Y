public class perfectabundantdeficient   {

    public static int sumOfDivisors(int n) {
        int sum = 1; 
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }
}
