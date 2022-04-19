package reflect.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-04-18-9:19
 **/
public class ReflectDemo1 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = ArrayList.class;
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        Package p = c.getPackage();
        System.out.println(p.getName());
//        Method[] m =  c.getMethods();
//        for(Method method:m){
//            System.out.println(method.getName()+"()");
//        }
        String className = new Scanner(System.in).nextLine();
//        Class cls = Class.forName(className);
//        System.out.println(cls.getName());
        Class person = Class.forName(className);
        Object object = person.newInstance();
        if(object instanceof Person){
            Person person1 = (Person)object;
        }else if(object instanceof Student){
            Student person1 = (Student)object;
        }
    }
}
