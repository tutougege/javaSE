package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author liwei
 * @create 2022-03-28-17:05
 **/
public class ReadDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("test_copy.txt");
        byte[] bytes = new byte[1024*10];
        int len;

    }
}
