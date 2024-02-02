package StringClassAndPrinting;

public class RegularExpressionsQuantifiers {
    public static void main(String args[]){
        String s="abcd";
        String a="aabbbbbbbcccdadbc";
        String b="";
        String mail="john@gmail.com";
        System.out.println(s.matches(".*"));
        System.out.println(s.matches("[a-z]*"));
        System.out.println(a.matches("[abcd]+"));
        System.out.println(b.matches("[abc]*"));
        System.out.println(b.matches("[abc]+"));
        System.out.println(b.matches("[abcd]{4}"));
        System.out.println(b.matches("[abc]{3,7}"));
        System.out.println(mail.matches(".*gmail.*"));
        System.out.println(b.matches("\\w*@gmail(.*)"));

    }
}
