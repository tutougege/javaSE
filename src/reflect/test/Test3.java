package reflect.test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/**
 * @author liwei
 * @create 2022-04-18-16:24
 *
 **/
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, URISyntaxException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
        两个开发中常用的相对路径
         */
        //1
//        File file = new File(Test3.class.getClassLoader().getResource(".").toURI());
//        System.out.println(file.getAbsolutePath());
        //2
        File file1 = new File(Test3.class.getResource(".").toURI());
        System.out.println(file1.getAbsolutePath());
        File[] files = file1.listFiles(f->f.getName().endsWith(".class"));
        for (File file:files){
            Class cls = Class.forName(Test3.class.getPackage().getName()+ "."
                    +file.getName().substring(0,file.getName().indexOf('.')));
            Object obj = cls.newInstance();
            Method[] methods = cls.getMethods();
            for(Method method :methods)
                if(method.getName()==cls.getSimpleName()&&method.getParameterCount()==0)
                    method.invoke(obj);
        }
    }
}
