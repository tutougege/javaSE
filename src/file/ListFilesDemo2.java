package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author liwei
 * @create 2022-03-25-15:31
 **/
/*

 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File f = new File("./src/file");

        File[] ff = f.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("o");
            }
        });
        System.out.println(ff.length);
        for (File i:ff
             ) {
            System.out.println(i.getName());
        }
    }
}
