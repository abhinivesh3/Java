package OperatorAndExpressions;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
         
        int a,b,c;
        double r1,r2;

        System.out.println("Enter values of a , b and c ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Root are "+r1+"  "+r2);
    }
}
