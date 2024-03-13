package LambdaExpression;

@FunctionalInterface
interface MyLambda{
    public int add(int x,int y);
}
public class Parameters {
    public static void main(String[] args) {
        MyLambda m=(a,b)->a+b;
        int r=m.add(20,30);
        System.out.println(r);
    }
}
