package StringClassAndPrinting;

import java.util.*;

public class StringProgram {
    public static void main(String[] args){
        String str1 = "Java Program";
        String str2=new String("JAVA");
        char c[] ={'H','e','l','l','o'};
        String str3=new String(c);
        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        String str5 = new String(b,2,2);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        String a1 = "java";
        String b1 = "java";
        System.out.println(a1==b1);

        String a2 = "java";
        String b2 = new String("java");
        System.out.println(a2==b2);
    }
}
