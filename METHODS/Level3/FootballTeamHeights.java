import java.util.Random;

public class FootballTeamHeights {

    public static int sum(int[] arr) {
        int s = 0;
        for (int h : arr) s += h;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        // generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101);
        }

        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
