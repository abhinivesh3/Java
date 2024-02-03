package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int A[]={3,9,6,7,4,64,56,32,56,7,8,9};
        int max=0,secMax=0;
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                secMax=max;
                max=A[i];
            }
            else if( secMax<A[i]){
                secMax=A[i];
            }
        }
        System.out.println("Second Maximum : "+secMax);
    }
}
