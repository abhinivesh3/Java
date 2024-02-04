package OOPs;

class Rectangle1{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(getLength() + getBreadth());
    }
    public boolean isSquare(){
        if(getLength()==getBreadth()){
            return true;
        }
        return false;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        System.out.println("IsSquare : "+r.isSquare());
        
        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth : "+r.getBreadth());
    }
}
