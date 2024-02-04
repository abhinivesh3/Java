package OperatorAndExpressions;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String args[]){
        float base,height,area;
        System.out.println("Enter Base and Height ");

        Scanner scanner = new Scanner(System.in);
        base = scanner.nextFloat();
        height = scanner.nextFloat();

        area = base*height/2;

        System.out.println("Area of a Triangle is "+area);


        int a,b,c;
        float s;
        double area1;
        
        System.out.println("Enter 3 sides of a Triangle ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        s=(a+b+c)/2f;

        area1=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area is "+area1);

    }
}
