package loop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int n= scanner.nextInt();
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("Count Digits : "+count );
    }
}
