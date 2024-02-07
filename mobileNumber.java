import java.util.Scanner;

class mobileNumber {
    public static void main(String[] args) {
        try{
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter First Number");
            long mobile = myObj.nextInt();
       System.out.println(mobile);
        }
        catch (Exception e) {
            System.out.println("You may have typed more than limit");
        }
        
   }
   }