class javaClass{
    public static void main(String[] args){
        int x=0;
        int y=0;
        char sum='/';
        switch(sum){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        
        
    }
}