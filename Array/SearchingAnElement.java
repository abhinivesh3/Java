package Array;

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int A[]={3,9,6,7,4,64,56,32,56,7,8,9};
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        for(int i=0;i<A.length;i++){
            if(A[i]==n){
                System.out.println("Element is found index is "+i);
                System.exit(0);
            }
        }
        System.out.println("Element is not found ");
    
    }
}
