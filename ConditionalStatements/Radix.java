package ConditionalStatements;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        // String num1 ="1010110";
        // String num2 ="12607";
        // String num3 ="24AE";
        // String num4 ="638842";

        Scanner scanner = new Scanner(System.in);
        String num;
        System.out.println("Enter a Number : ");
        num=scanner.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal Radix=8");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexa Radix=16");
        }
        else {
            System.out.println("Decimal Radix=10");
        }
    }
}
