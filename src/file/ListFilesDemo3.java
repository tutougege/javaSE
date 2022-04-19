package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author liwei
 * @create 2022-03-25-16:29
 **/
public class ListFilesDemo3 {
    public static void main(String[] args) {
        File f = new File("./src/file");
        if(f.isDirectory()){
            File[] ff =  f.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().contains("List");
                }
            });
            for (File i:ff) {
                System.out.println(i.getName());
            }
        }
    }
}
