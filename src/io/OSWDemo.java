package io;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

import java.io.*;

/**
 * @author liwei
 * @create 2022-03-29-14:47
 **/
public class OSWDemo {
    /*
    Reader、Writer里定义读写字符流的相关方法
    特点是都是以char为单位的
    转换流:
           java.io.InputStreamReader 和 OutputStreamWriter
            他们是常见的字符流实现类，同时是一对高级流 开发中不会直接用到他们 但事实六联接重要的一环
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        String line = "好好学习天天向上";
        osw.write(line);
        System.out.println("写入完毕");
        osw.close();
    }
}
