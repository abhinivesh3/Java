package MultiThreading;

/*class MyThread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}*/

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class  ThreadWithDaemonJoinYield//implements Runnable //extends Thread
{
    /*public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }*/
    
    public static void main(String[] args) {
        
        //MyThread t=new MyThread();
        //ThreadTest t=new ThreadTest();
        // t.setDaemon(true);
        // t.start();
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);
        
        th.start();
        
        int i=1;
        while(true){
            System.out.println(i+"World");
            //Thread.yield();
        }
        
    }
    
}