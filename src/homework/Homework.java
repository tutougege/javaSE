package homework;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.FieldAccessor_Ref;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liwei
 * @create 2022-03-28-18:43
 **/
public class Homework {
    public static void main(String[] args) throws IOException {
        File f = new File("./src/test.txt");
        if(f.exists()){
            System.out.println(f.getName());
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
            File[] ff = f.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().equals("a");
                }
            });
            File[] fff = f.listFiles(pathname->
                    pathname.getName().contains("a"));
            System.out.println(Arrays.toString(fff));
        }else {
            f.createNewFile();
        }

    }
}
