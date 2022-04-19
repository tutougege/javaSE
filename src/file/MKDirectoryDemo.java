package file;

import java.io.File;

/**
 * @author liwei
 *
 * @create 2022-03-25-14:21
 **/
public class MKDirectoryDemo {
    public static void main(String[] args) {
        File f = new File("./demo");
        if(f.exists()){
            System.out.println("该目录已存在");
        }else {
            f.mkdirs();
            System.out.println("该目录已创建");
        }

    }
}
