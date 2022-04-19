package reflect.test;

import javafx.scene.shape.VLineTo;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import reflect.annotations.AutoRunMethod;
import reflect.annotations.AutorunClass;
import reflect.demo.Person;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-04-19-14:57
 **/
public class Test7 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        File file = new File(Person.class.getResource(".").toURI());
        File[] files = file.listFiles(f->f.getName().endsWith(".class"));
        for(File file1:files){
            Class cls = Class.forName(Person.class.getPackage().getName()+"."
                    +file1.getName().substring(0,file1.getName().indexOf('.')));
            if(cls.isAnnotationPresent(AutorunClass.class)){
                Method[] methods = cls.getDeclaredMethods();
                Object o = cls.newInstance();
                for(Method method:methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                        int value = arm.value();
                        for (int i = 0; i < value; i++) {
                            method.invoke(o);
                        }
                    }
                }
            }

        }
    }

}
