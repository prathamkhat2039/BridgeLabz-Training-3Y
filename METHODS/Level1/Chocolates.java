import java.util.Scanner;

public class Chocolates {
    public static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int ch = sc.nextInt(), kids = sc.nextInt();

        int[] result = distribute(ch, kids);
        System.out.println("Each child gets " + result[0] + " chocolates and remaining " + result[1]);
    }
}
