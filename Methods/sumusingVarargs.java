package Methods;

public class sumusingVarargs {
    static int sum(int ...A){
        int s=0;
        for(int i=0;i<A.length;i++){
            s+=A[i];
        }
        return s;
    }
    
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        System.out.println(A);
    }
}
