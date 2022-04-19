package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author liwei
 * @create 2022-03-28-9:41
 **/
public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileOutputStream f1 = new FileOutputStream("./fos.dat");
        f1.write(1);
        f1.write(2);
        f1.write(3);
        f1.write(4);
        System.out.println("写入完毕");
        f1.close();
    }
}
