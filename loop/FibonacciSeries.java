package loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Program to Fibonacci Series");
        System.out.println("Enter number of Terms");
        int n=scanner.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
