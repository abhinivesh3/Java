package JavaIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedStreamsAndBufferedReader {
     public static void main(String[] args)throws Exception {
        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}
