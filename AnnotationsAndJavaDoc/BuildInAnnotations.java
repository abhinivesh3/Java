package AnnotationsAndJavaDoc;

class A{
    public void display(){
        
    }
}

class B extends A{
    @Override
    public void display(){
        System.out.println("hello");
    }
    @Deprecated
    public void show(){
        System.out.println("hi");
    }
    
}

public class BuildInAnnotations {
    
    public static void main(String[] args) {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
        b.display();
        b.show();
    }
    
}