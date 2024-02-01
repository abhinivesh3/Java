package OperatorAndExpressions;

import java.util.*;

public class Cuboid {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;

        System.out.println("Enter Length breadth and height ");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        height = scanner.nextInt();

        totalArea = 2*(length*breadth+length*height+breadth*height);

        volume = length*breadth*height;

        System.out.println("Total Area "+totalArea);
        System.out.println("Volume "+volume);
    }
    
}
