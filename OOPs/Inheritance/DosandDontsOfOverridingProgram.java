package OOPs.Inheritance;

class A{}
class B extends A{}

class Super{
    public A display(){
        System.out.println("Super Display");
        return new A();
    }
}
class Sub extends Super{
    public B display(){
        System.out.println("Sub Display");
        return new B();
    }
}
public class DosandDontsOfOverridingProgram {
    public static void main(String[] args) {
        Sub s= new Sub();
        s.display();
    }
}
