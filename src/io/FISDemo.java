package io;

import java.io.*;

/**
 * @author liwei
 * @create 2022-03-28-10:17
 **/
public class FISDemo {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        FileOutputStream fos1 = new FileOutputStream("./Image/java1_copy.jpg");
        FileInputStream fis1 = new FileInputStream("./Image/java1.jpg");
        int d;
        long start = System.currentTimeMillis();
        while ((d = fis1.read())!=-1){
            fos1.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        fis1.close();
        fos1.close();
    }
}
