package MultiThreading;

class MyRun implements Runnable {
    public void run(){
        System.out.println("runnable");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRun() , "My Name");
    }
}
