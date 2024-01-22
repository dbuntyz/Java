import java.util.Scanner;

public class javaClass{
    public static void main(String[] args){
         
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter First Number");
            int x = myObj.nextInt();
            System.out.println("Enter Second Number");
            int y = myObj.nextInt();
                    // Consume the newline character
        myObj.nextLine();
            System.out.println("Enter + - * / Number");
            String opr = myObj.nextLine();
        
        switch(opr){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        
        
    }
}