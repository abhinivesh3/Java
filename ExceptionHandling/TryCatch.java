import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=scanner.nextInt();
        b=scanner.nextInt();
        
        try{
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0, try again"+e);
        }
        System.out.println("Bye");  
    } 
}
