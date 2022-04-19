package reflect.test;

import reflect.annotations.AutoRunMethod;
import reflect.annotations.AutorunClass;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/**
 * @author liwei
 * @create 2022-04-19-11:55
 **/
public class Test6 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        File file = new File(Test6.class.getResource(".").toURI());
        File[] files = file.listFiles(f->f.getName().endsWith(".class"));
        for(File file1 :files){
            Class cls = Class.forName(Test6.class.getPackage().getName()+ "."
                    + file1.getName().substring(0,file1.getName().indexOf('.')));
            if(cls.isAnnotationPresent(AutorunClass.class)){
                Object obj = cls.newInstance();
               Method[] methods = cls.getDeclaredMethods();
               for(Method method :methods){
                   if(method.isAnnotationPresent(AutoRunMethod.class)){
                       method.invoke(obj);
                   }
               }
            }
        }
    }
}
