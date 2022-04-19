package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author liwei
 * @create 2022-03-29-15:30
 **/
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        InputStreamReader isr = new InputStreamReader(fis,UTF_8);
        int len;
        while((len = isr.read())!=-1){
            System.out.print((char)len);
        }
    }
}
