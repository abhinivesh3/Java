package OOPs.Inheritance;

class Super{
    public void display(){
        System.out.println("Super Display");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Display");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        // Super s=new Super();
        // s.display();
        
        // Sub s = new Sub();
        // s.display();

        Super s=new Sub();
        s.display();
        
    }    
}
