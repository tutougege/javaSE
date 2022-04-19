package exception;

import java.io.FileOutputStream;

/**
 * @author liwei
 * @create 2022-03-30-17:17
 **/
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "abc";
            int a = Integer.valueOf(str);
        } catch (NumberFormatException e){
            e.printStackTrace();//输出错误信息
            System.out.println(e.getMessage());
        }
        System.out.println("程序结束了");
    }
}
