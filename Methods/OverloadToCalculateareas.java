package Methods;

import ConditionalStatements.day;

public class OverloadToCalculateareas {
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static double area(double length,double breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println("Area of Circle : "+area(23.0));
        System.out.println("Area of Rectangle : "+area(23,32));
    }
}
