package file;

import java.io.File;

/**
 * @author liwei
 * @create 2022-03-25-14:16
 **/
public class DeleteDemo {
    public static void main(String[] args) {
        File f1 =new File("test.txt");
        if(f1.exists()){
            f1.delete();
            System.out.println("已删除");
        }else {
            System.out.println("文件不存在");
        }

    }
}
