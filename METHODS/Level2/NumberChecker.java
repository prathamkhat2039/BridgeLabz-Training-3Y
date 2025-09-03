import java.util.*;

public class NumberChecker {
    
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.println(nums[i] + " is Positive");
                if (isEven(nums[i])) 
                    System.out.println("Even");
                else 
                    System.out.println("Odd");
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }

        int result = compare(nums[0], nums[nums.length - 1]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result > 0) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
