package StringClassAndPrinting;

public class FormatSpecifier {
    public static void main(String args[]){
        int x=10;
        float y= 0.0012f;
        char z ='A';
        String str = "Java Program";
        System.out.printf("%1$d %1$d %1$d\n",x);
        System.out.printf("%1$d %2$f %1$d\n",x,y);

        int a=10;
        System.out.printf("%5d\n",a);
        System.out.printf("%05d\n",a);
        System.out.printf("%(5d\n",a);
        System.out.printf("%+5d\n",a);
        a=-10;
        System.out.printf("%(5d\n",a);

        float b=123.45f;
        System.out.printf("%f\n",b);
        System.out.printf("%6.2f\n",b);
        System.out.printf("%06.2f\n",b);

    }
}
