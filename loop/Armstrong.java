package loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int n= scanner.nextInt();
        int value=n;
        int sum=0;
        while(n>0){
            int a=n%10;
            sum+=(a*a*a);
            n/=10;
        }
        if(sum ==value ){
            System.out.println("Given Number is Armstrong");
        }
        else{
            System.out.println("Given Number is not Armstrong");
        }
    }
}
