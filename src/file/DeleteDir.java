package file;

import java.io.File;

/**
 * @author liwei
 * @create 2022-03-25-14:45
 **/
public class DeleteDir {
    public static void main(String[] args) {
        File f = new File("demo");
        f.delete();
    }
}
