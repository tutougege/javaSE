package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author liwei
 * @create 2022-03-29-16:06
 **/
/*
缓冲字符输入输出流
java.io.BufferedWriter 和 BufferedReader
缓冲字符流是一对高级字符流，他的作用是块写文本数据加速的
java.io.PrintWriter具有自动行刷新的缓冲字符输出流,内部总是连接BufferedWriter
更常用
 */
public class PWDemo1 {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("fos.txt","utf-8");
        pw.println("好好学习,");
        pw.println("天天向上。");
        System.out.println("完毕");
        pw.close();
    }
}
