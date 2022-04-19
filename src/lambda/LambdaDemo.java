package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * @author liwei
 * @create 2022-03-25-17:09
 **/
/*
    JDK8推出的新特性:lambda表达式
    lambda可以使程序员面向函数式编程

    但是lambda创建匿名内部类是要求实现接口中只能有一个抽象方法
    (参数列表)->{
        方法体
    }
 */
public class LambdaDemo {
    public static void main(String[] args) {
        File f = new File("./src/file");
        File[] ff =  f.listFiles((File pathname)->{return pathname.getName().contains("List"); });
        for (File i: ff
             ) {
            System.out.println(i.getName());
        }

        //可以省略参数类型
        FileFilter filter = file->{
            return file.getName().contains("List");};
        //如果只有一个参数，则可以省略参数的括号
        FileFilter filter1 = file->{
            return file.getName().contains("List");};
        //如果方法体只有一句话，方法体的大括号可以省略
        FileFilter filter2 = file->
                file.getName().contains("List");
    }

}
