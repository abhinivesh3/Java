package loop;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int n= scanner.nextInt();
        int reverse=0;
        while(n>0){
            reverse=reverse*10 + (n%10);
            n/=10;
        }
        System.out.println("Reverse of Number : "+reverse );
    }
}
