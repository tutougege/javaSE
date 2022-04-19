package reflect.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liwei
 * @create 2022-04-18-15:20
 **/
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.demo.Person");
        Object obj = cls.newInstance();
        Method method = cls.getMethod("doSomeThing", String.class);
        method.invoke(obj,"玩游戏");
        Method method1 = cls.getMethod("doSomeThing", String.class,int.class);
        method1.invoke(obj,"玩游戏",5);
    }
}
