package reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liwei
 * @create 2022-04-18-11:43
 **/
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Person> personList = new ArrayList<>();//创建Person集合
        Constructor constructor = Class.forName("reflect.demo.Person").getConstructor(String.class,int.class);//找到Person的类加载路径,并指定构造器

        for (int i = 1; i <= 10; i++)
             personList.add((Person) constructor.newInstance("test"+i,20+i));//创建Person实例并存入集合


        //创建集合的迭代器
        Iterator iterator = personList.iterator();
       while (iterator.hasNext())//遍历
           System.out.println(iterator.next().toString());//拿到指定的元素并且输出
    }
}
