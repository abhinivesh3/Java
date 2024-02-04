package OOPs.Constructor;

class Rectangle{
    private double length;
    private double breadth;
    
    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public Rectangle(double s){
        length=breadth=s;
    } 
    public double area(){
        return length*breadth;
    }
    
}

public class RectangleProgram {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(10);
        System.out.println("Parameter 0 : "+r.area());
        System.out.println("Parameter 2 : "+r1.area());
        System.out.println("Parameter 1 : "+r2.area());
    }
    
}
