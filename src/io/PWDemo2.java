package io;

import java.io.*;

/**
 * @author liwei
 * @create 2022-03-29-16:54
 **/
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("fos.txt");//文档
        FileOutputStream fos = new FileOutputStream(file,true);//文件字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");//字节输出流转换为字符输出流
        BufferedWriter bos = new BufferedWriter(osw);//用字符缓冲输出流加速字符输出流
        PrintWriter pw = new PrintWriter(bos);//可刷新行字符缓冲输出流增强字符缓冲输出流
        pw.println("好好学习，");//写入并换行
        pw.println("天天向上。");
        System.out.println("写入成功");
        pw.close();
    }
}
