package JavaLangPackage;

public class FloatAndCharacterAndBooleanClasses {
    public static void main(String[] args) {
        float a=12.5f;
        // Float b=12.5f/0;

        // System.out.println(b.isInfinite());
        // System.out.println(b==Float.POSITIVE_INFINITY);
        // System.out.println(b==Float.NEGATIVE_INFINITY);
        // Float b=(float)Math.sqrt(-1);
        Float b=(float)Math.sqrt(9);
        System.out.println(b.isNaN());
        System.out.println(b!=Float.NaN);

        Character ch='A';
        
        Boolean.compare(false, false);
    }
}
