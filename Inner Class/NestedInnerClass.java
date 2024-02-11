class Outer{
    int x=10;
    class Inner{
        int  y=20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void OuterDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();;
        Outer.Inner i = new Outer().new Inner();
    }
}
