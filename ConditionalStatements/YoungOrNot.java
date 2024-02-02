package ConditionalStatements;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int a =scanner.nextInt();
        if(a>=14 && a<=55){
            System.out.println("You are Young");
        }
        else{
            System.out.println("You are not Young");
        }
    }
}
