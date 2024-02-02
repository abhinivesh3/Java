package ConditionalStatements;

import java.util.Scanner;

//Display name of a day based on number
//Display name of a month based on number
//Display type of website

public class websiteSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter Domain name");
        String domain=scanner.nextLine();
        
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com": 
                System.out.println("Commercial");
                break;
            case "org": 
                System.out.println("Organisation");
                break;                
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
        }
    }
}
