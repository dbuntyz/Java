import java.util.Scanner;
class double_digit {
     public static void main(String[] args) {
        int sum, sub, product, divide, mod; //Variables initialized for storing the result of summation 
         
        Scanner usrInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Value 1");
        int val1 = usrInput.nextInt(); 
        
        Scanner usrInput2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Value 2");
        int val2 = usrInput2.nextInt(); 
        
        Scanner usrInput3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Switch Case Value - 1 For Sum, 2 For Substract, 3 For Product, 4 For Divide");
        int val3 = usrInput3.nextInt();
        
        switch(val3) //val3 is the case number
        {
            case 1:
                sum = val1+val2;
                System.out.println("The " + val1 + " + " + val2 + " equals to " + sum);
                break;
            case 2:
                sub = val1-val2;
                System.out.println("The " + val1 + " - " + val2 + " equals to " + sub);
                break;
            case 3:
                product = val1*val2;
                System.out.println("The " + val1 + " * " + val2 + " equals to " + product);
                break;
            case 4:
                divide = val1/val2;
                mod = val1%val2;
                System.out.println("The " + val1 + " / " + val2 + " equals to " + divide);
                System.out.println("The " + val1 + " % " + val2 + " remider is " + divide);
                break;
            default:
                System.out.println("Invalid Choice"); //For any other input than expected.
            }
    }
}
