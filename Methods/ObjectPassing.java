package Methods;

public class ObjectPassing {
    static void change(int X[], int index,int value){
        X[index]=value;
    }
    public static void main(String[] args) {
        int A[] = {2,4,6,8,10};
        change(A,2,20);
        for( int x:A){
            System.out.println(x);
        }
    }
}
