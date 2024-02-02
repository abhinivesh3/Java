package StringClassAndPrinting;

public class RegularExpressionsMetaCharacters {
    public static void main(String args[]){
        String a="10";
        String b="a";
        String s="abc";
        String s1="a";
        String space=" ";
        System.out.println("Digits d : "+a.matches("\\d"));
        System.out.println("Not Digits D : "+a.matches("\\D"));
        System.out.println("Space s : "+space.matches("\\s"));
        System.out.println("Not Space S : "+space.matches("\\S"));
        System.out.println("AlphabetsOrDigit w : "+s1.matches("\\w"));
        System.out.println("Neither AlphabetsOrDigit W : "+a.matches("\\W"));

    }
}
