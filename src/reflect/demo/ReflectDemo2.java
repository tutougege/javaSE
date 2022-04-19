package reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-04-18-11:21
 **/
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName(new Scanner(System.in).nextLine());
        Constructor c = cls.getConstructor(String.class,int.class);
        Object o = c.newInstance("李四",50);
        System.out.println(o.toString());
    }
}
