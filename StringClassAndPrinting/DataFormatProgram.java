package StringClassAndPrinting;

//Find is the data in Data format(dd/mm/yyyy)
public class DataFormatProgram {
    public static void main(String[] args) {
        String d="01/12/2002";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
