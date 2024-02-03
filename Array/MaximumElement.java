package Array;

public class MaximumElement {
   public static void main(String[] args) {
        int A[]={3,9,6,7,4,64,56,32,56,7,8,9};
        int max=0;
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        System.out.println("Maximum element : "+max);
   } 
}
