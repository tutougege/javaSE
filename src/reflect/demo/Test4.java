package reflect.demo;

import reflect.annotations.AutorunClass;

import java.io.File;
import java.net.URISyntaxException;

/**
 * @author liwei
 * @create 2022-04-19-10:28
 **/
public class Test4 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        File file = new File(Test4.class.getResource(".").toURI());
        File[] files = file.listFiles(f->f.getName().endsWith(".class"));
        for(File file1 :files){
            Class cls = Class.forName(Test4.class.getPackage().getName()+"."+file1.getName().substring(0,file1.getName().indexOf('.')));
            if(cls.isAnnotationPresent(AutorunClass.class)){
                Object o = cls.newInstance();
            }
        }
    }
}
