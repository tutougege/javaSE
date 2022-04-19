package io;

import java.beans.PersistenceDelegate;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * @author liwei
 * @create 2022-03-29-10:31
 **/
public class OOSDemo {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一个演员","来自霓虹","台词较少","港大男同学的启蒙老师"};
        Ponse p = new Ponse(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();
    }
}
