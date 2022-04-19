package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author liwei
 * @create 2022-03-28-14:03
 **/
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./Image/6-10.htm");
        FileOutputStream fos = new FileOutputStream("./6-10_copy.htm");
        int len;
        byte[] bytes = new byte[1024*10];
        long start = System.currentTimeMillis();
        while((len = fis.read(bytes)) != -1){
//            fos.write(bytes);
            fos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fos.close();
        fis.close();
    }
}
