package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author liwei
 * @create 2022-03-28-15:25
 **/
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        String s = "好好学习天天向上\n";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);
        fos.write(b);
        fos.close();
    }
}
