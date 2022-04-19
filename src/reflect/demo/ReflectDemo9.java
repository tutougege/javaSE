package reflect.demo;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

/**
 * @author liwei
 * @create 2022-04-19-14:46
 **/
public class ReflectDemo9 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("reflect.demo.Person");
        Method[] methods = cls.getDeclaredMethods();
        for(Method method :methods){
            if(method.isAnnotationPresent(AutoRunMethod.class)){
                AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                int value = arm.value();
                System.out.println(
                        "方法"+method.getName()+
                        "上的注解AutoRunMethod指定的参数值为:"+value
                );
            }
        }
    }
}
