package LambdaExpression;

@FunctionalInterface
interface MyLambda{
    public void display();//functionalinterface for only one function
}

/*class My implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}
*/
public class Lambda {
    public static void main(String[] args) {
        //MyLambda m=new My();
        //anonymous inner class
        // MyLambda m =new MyLambda() {
        //     public void display(){
        //         System.out.println("Hello World");
        //     }
        // };
        //or
        MyLambda m=
            ()->
            {
                System.out.println("Hello World");
            };
        m.display();
    }
}
