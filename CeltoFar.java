import java.util.Scanner;

class CeltoFar {
    public static void main(String[] args) {
try {
    
        Scanner usrInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Values of Celsius");
        int celsius = usrInput.nextInt();

        double result = (celsius * 9/5) + 32;

        System.out.println(result + "°F");

} catch (Exception e) {
    System.out.println("Invalid Input");
}
    }
    
}
