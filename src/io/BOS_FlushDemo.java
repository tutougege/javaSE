package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author liwei
 * @create 2022-03-29-9:33
 **/
public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("./test.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fis);
        bos.write("好好学习".getBytes(StandardCharsets.UTF_8));
//        bos.flush();
        bos.close();
    }
}
