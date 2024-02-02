package StringClassAndPrinting;

public class RegularExpressionsMatchingSymbols {
    public static void main(String args[]){
        String s="abc";
        String c="A";
        System.out.println("AnyCharacter . : "+(c.matches(".")));
        System.out.println("Exactly give letters [abc] : "+(s.matches("[abc]")));
        System.out.println("Eitherfirstorsecondset [abc][vz] : "+(s.matches("[abc][vz]")));
        System.out.println("Except abc  [^abc]: "+(s.matches("[^abc]")));
        System.out.println("a-z or 1-7 [a-z][1-7] : "+(s.matches("[a-z1-7]")));
        System.out.println("A or B A|B :"+(c.matches("[A|B]")));
        System.out.println("Exactly xz xz : "+(s.matches("abc")));

    }
}
