package loop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int n= scanner.nextInt();
        int value=n;
        int reverse=0;
        while(n>0){
            reverse=reverse*10 + (n%10);
            n/=10;
        }
        if(reverse==value){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome" );
        }    
    }
}
