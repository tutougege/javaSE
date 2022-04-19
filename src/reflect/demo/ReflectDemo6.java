package reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liwei
 * @create 2022-04-18-15:37
 **/
public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Person p = new Person();
//        p.doSome();
        Class cls = Class.forName("reflect.demo.Person");
        Object obj = cls.newInstance();
        Method method =  cls.getDeclaredMethod("doSome");//暴力反射
        method.setAccessible(true);//强行打开doSome方法访问权限
        method.invoke(obj);
    }
}
