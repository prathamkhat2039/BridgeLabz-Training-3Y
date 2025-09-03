import java.util.Calendar;
import java.util.Scanner;

public class CalendarProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Current date and time
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date & Time: " + cal.getTime());
        
        // Extract parts of the date
        System.out.println("Year   : " + cal.get(Calendar.YEAR));
        System.out.println("Month  : " + (cal.get(Calendar.MONTH) + 1)); // Jan = 0
        System.out.println("Day    : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour   : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + cal.get(Calendar.MINUTE));
        System.out.println("Second : " + cal.get(Calendar.SECOND));
        
        // Week and Day info
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of Week : " + days[cal.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.println("Week of Year: " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month: " + cal.get(Calendar.WEEK_OF_MONTH));

        // Example: User input for custom date
        System.out.print("\nEnter year, month, day (yyyy mm dd): ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        Calendar custom = Calendar.getInstance();
        custom.set(y, m - 1, d); // Month is 0-based

        System.out.println("Your Entered Date: " + custom.getTime());
        System.out.println("It falls on: " + days[custom.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
