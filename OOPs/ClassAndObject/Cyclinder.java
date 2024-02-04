package OOPs.ClassAndObject;


//Properties:
//radius
//height

//Methods:
//lidArea()
//totalSurfaceArea()
//volume()
//circumference()

class Cyclinder1{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return circumference();
    }
}
public class Cyclinder {
    public static void main(String[] args) {
        Cyclinder1 c =new Cyclinder1();
        c.height=10;
        c.radius=7;
        System.out.println("LidArea : "+c.lidArea());
        System.out.println("Total Surface Area : "+c.totalSurfaceArea());
        System.out.println("Circumference : "+c.circumference());
        System.out.println("Volume : "+c.volume());
    }
}
