package loop;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int n= scanner.nextInt();
        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
    
}
