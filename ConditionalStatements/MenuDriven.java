package ConditionalStatements;

import java.util.Scanner;

//Make a Menu Driven Program for Arithmetic Operations

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
       System.out.println("Menu");
       System.out.println("====");
       System.out.println("ADD");
       System.out.println("SUB");
       System.out.println("MUL");
       System.out.println("DIV");
       
       System.out.println("Enter 2 Numbers");
       int x=scanner.nextInt();
       int y=scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter Option in Words ");
       String option=scanner.nextLine();
       option=option.toUpperCase();
       
       switch(option)
       {
           case "ADD": System.out.println("Sum is "+(x+y));
                        break;
           case "SUB": System.out.println("Difference is "+(x-y));
                        break;
           case "MUL": System.out.println("Product is "+(x*y));
                        break;
           case "DIV": System.out.println("Ratio is "+(x/y));
                        break;
           default:     System.out.println("Invalid Option");
                        break;             
       }
    }
}
