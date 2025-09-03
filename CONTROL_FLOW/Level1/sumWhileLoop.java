import java.util.Scanner; 
public class sumWhileLoop
{

//     Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
 // Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();
            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }
            total += number; // Add the number to the total
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
    
}
