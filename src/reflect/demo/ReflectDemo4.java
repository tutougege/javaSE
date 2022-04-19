package reflect.demo;

import sun.awt.AWTAccessor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-04-18-14:02
 * 反射机制调用方法
 **/
public class ReflectDemo4 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName(new Scanner(System.in).nextLine());
        Object obj = cls.newInstance();
        Method m = cls.getMethod(new Scanner(System.in).nextLine());
        m.invoke(obj);
    }
}
