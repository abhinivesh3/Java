package StringClassAndPrinting;

//Remove Special Characters from a String
//Remove extra spaces from string
//Find number of words in a String

public class Program {
    public static void main(String[] args) {
        String s ="a!B@c#1$2%3";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
    
        String s1 ="abc def     gh          hgy";
        System.out.println(s1.replaceAll("\\s+", " "));
   
        String s12 ="   abc      def     gh          hgy           ";
        System.out.println(s12.replaceAll("\\s+", " ").trim());
   
        String s2 ="abc def     gh          hgy";
        s2=s2.replaceAll("\\s+"," ").trim();
        String words[]=s2.split("\\s");
        System.out.println(words.length);
   
    }
}
