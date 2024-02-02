package StringClassAndPrinting;

public class StringMethods {
    public static void main(String args[]){
        String s ="  Welcome to Java";
        String a= "java";
        String b= "JaVA";
        String c="java";
        System.out.println("Length of String : "+s.length());
        System.out.println("toLowerCase of String : "+s.toLowerCase());
        System.out.println("toUpperCase of String : "+s.toUpperCase());
        System.out.println("trim of String : "+s.trim());
        System.out.println("substring begin of String : "+s.substring(5));
        System.out.println("substring begin & end of String : "+s.substring(6,15));
        System.out.println("replace of String : "+s.replace('a','x'));
        System.out.println("startWith of String : "+s.startsWith("Welcome"));
        System.out.println("endWith of String : "+s.endsWith("Java"));
        System.out.println("charAt of String : "+s.charAt(7));
        System.out.println("indexOf of String : "+s.indexOf("a"));
        System.out.println("indexOf of String : "+s.indexOf("a",15));//we can given starting index
        System.out.println("lastIndexOf of String : "+s.lastIndexOf("a"));
        System.out.println("equals of String : "+a.equals(c));
        System.out.println("equalsIgnoreCase of String : "+a.equalsIgnoreCase(b));
        System.out.println("CompareTo of String : "+a.compareTo(c));
        System.out.println("compareIgnoreCase of String : "+a.compareToIgnoreCase(b));
        System.out.println("valueOf ofString : "+s.valueOf(6));
    }
}
