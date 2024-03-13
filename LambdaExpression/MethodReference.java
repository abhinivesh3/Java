package LambdaExpression;

interface MyLambda{
    public void display(String str);
}
public class MethodReference {
    // public static void reverse(String str){
    //     StringBuffer sb=new StringBuffer(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }

    public MethodReference(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        //MyLambda ml=System.out::println;
      //MethodReference ld =new  MethodReference();
      //MyLambda ml=ld::reverse; 

        //static use class name
        //MyLambda ml=MethodReference::reverse;
        
        MyLambda ml=MethodReference::new;
        //Compare to 2 string parameter
        //MyLambda ml=String::compareTo; 
        ml.display("Hello");
    }
}
