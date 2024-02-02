package OperatorAndExpressions;

public class BitwiseOperators {
    public static void main(String args[]){
        //int x=10,y=6;
        int x = 0b1010;
        int y = 0b0110;
        System.out.println("And & operator : "+(x&y));
        System.out.println("OR | operator : "+(x|y));
        System.out.println("NOT ~ operator : "+(~x));
        System.out.println("XOR ^ operator : "+(x^y));
        System.out.println("leftShift << operator : "+(x<<1));
        System.out.println("rightShift >> operator : "+(x>>1));
        int xn=-0b1010;
        System.out.println("Unsigned Right Shift >>> operator : "+(xn>>>1));
        System.out.println(String.format("%s", Integer.toBinaryString(xn>>>1)));
    }
}
