package ConditionalStatements;

import java.util.Scanner;

public class GradesMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three marks :");
        int mark1=scanner.nextInt();
        int mark2=scanner.nextInt();
        int mark3=scanner.nextInt();
        int avg =(mark1+mark2+mark3)/3;
        
        if(avg>70){
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<70){
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<60){
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<50){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade E");
        }
    }
}
