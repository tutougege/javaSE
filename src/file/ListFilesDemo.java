package file;

import java.io.File;
import java.util.Arrays;

/**
 * @author liwei
 * @create 2022-03-25-15:09
 **/
public class ListFilesDemo {
    public static void main(String[] args) {
        File f = new File("./src/file");
        if(f.isDirectory()){
            File[] f1 =f.listFiles();
            System.out.println(f1.length);
            System.out.println(Arrays.toString(f1));
            for (File i:f1
                 ) {
                System.out.println(i.getName());
            }
        }else {
            System.out.println("0");
        }
    }
}
