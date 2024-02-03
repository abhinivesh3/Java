package Methods;

public class MaxElementInAnArray {
    static int max(int [] A){
        int max=0;
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[] ={34,56,31,65,45,22,12,45,64,65,67,73,84,66,21,12,16};
        System.out.println("Maximum Element of an Array : "+max(A));
    }
}
