package reflect.demo;

import reflect.annotations.AutorunClass;

import java.io.File;
import java.net.URISyntaxException;

/**
 * @author liwei
 * @create 2022-04-19-10:12
 **/
public class ReflectDemo8 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException {
        File file  = new File(ReflectDemo8.class.getClassLoader().getResource(".").toURI());
        System.out.println(file.getName());
        Class cls = Class.forName("reflect.demo.Person");
        System.out.println(cls.isAnnotationPresent(AutorunClass.class));
    }
}
