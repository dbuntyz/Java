// Importing Library for Scanner (User Input)
import java.util.Scanner;
// Define Class
class javaclassswitch {
    // Public Main Method
    public static void main(String[] args) {
        // Scanner Initializing
        Scanner scanner = new Scanner(System.in);
// Try catch used for user input santizing
        try {
            System.out.println("Enter a year:");
            int usrInput = scanner.nextInt();
        // user input validation for 4 numbers under 1000 to 9999
            if (usrInput < 1000 || usrInput > 9999 ) {
                System.out.println("Please enter a valid year between 1000 and 9999.");
        // to find whether it is possible to divide by 4 or not.
            } else if (usrInput % 4 == 0) {
                System.out.println("Leap year!");
            } else {
                System.out.println("Not a leap year.");
            }
        // if the input data type is other than Integer, below error will print
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
