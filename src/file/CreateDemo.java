package file;

import java.io.File;
import java.io.IOException;

/**
 * @author liwei
 * @create 2022-03-25-11:45
 **/
public class CreateDemo {
    public static void main(String[] args) {
        File f1 = new File("./test.txt");
        if(f1.exists()){
            //
            System.out.println("该文件已存在!");
        }else {
            try {
                f1.createNewFile();
            }catch (IOException e){
                //如果目录不存在则会抛出异常
                System.out.println(e);
            }
        }

    }
}
