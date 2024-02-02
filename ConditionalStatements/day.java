package ConditionalStatements;

import java.util.Scanner;

//Display name of a day based on number

public class day {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter a Day number");
        int day=scanner.nextInt();
        
        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
              System.out.println("Tueday");
        }
        else if(day==3){
              System.out.println("Wednesday");
        }
        else if(day==4){
              System.out.println("Thurday");
        }
        else if(day==5){
              System.out.println("Friday");
        }
        else if(day==6){
              System.out.println("Satday");
        }
        else if(day==7){
              System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid Day Number");
        }
        
    }
}
