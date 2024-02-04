package OOPs.ClassAndObject;


//Properties:
//length
//breadth

//Methods:
//area()
//perimeter()

class Rectangle1{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        return false;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.breadth=5.5;
        r.length=10.5;

        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        System.out.println("IsSquare : "+r.isSquare());
    }
}
