package io;

import java.io.*;

/**
 * @author liwei
 * @create 2022-03-29-11:01
 **/
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Ponse p = (Ponse)ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
