package Array;

public class SumOfAllElement {
    public static void main(String[] args) {
        int A[]={3,9,6,7,4,64,56,32,56,7,8,9};
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        System.out.println("Sum of all elements : "+sum);
    }
}
