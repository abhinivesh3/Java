package StringClassAndPrinting;

//Find is a Number is Hexa-Decimal or not
public class HexaDecimalProgram {
    public static void main(String[] args) {
        String str="234AB";
        System.out.println(str.matches("[0-9A-F]+"));
    }
}
