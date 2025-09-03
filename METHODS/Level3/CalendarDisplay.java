import java.util.Scanner;

public class CalendarDisplay {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get Month Name
    public static String getMonthName(int month) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in Leap Year
        }
        return days[month];
    }

    // Method to get first day of month using Gregorian Calendar algorithm
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m0)/12) % 7; // 0 = Sunday, 1 = Monday ...
    }

    // Method to print calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(1, month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days of month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println(); // Next line after Saturday
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}
