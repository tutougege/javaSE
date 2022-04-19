package reflect.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liwei
 * @create 2022-04-18-14:34
 **/
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("reflect.demo.Person");
        Object obj = cls.newInstance();
        Method[] methods = cls.getMethods();
        for(Method method :methods){
            if(method.getName().contains("say")&&method.getParameterCount()==0){
                method.invoke(obj);
            }
        }
    }
}
