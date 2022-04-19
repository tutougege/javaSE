package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-03-29-17:14
 **/
/*
File file = new File("fos.txt",true);
FileOutputStream fos = new FileOutputStream(file,"utf-8");
outPutStreamWriter osw = new outPutStreamWriter(fos);
BufferedWriter bw = new BufferedWriter(osw);
PrintWriter pw = new PrintWriter(bw);
pw.println("好好学习");
pw.close();
 */
public class TextTable {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("fos.txt");
        String input;
        while(!"exit".equals(input = new Scanner(System.in).nextLine()))
            pw.println(input);
        pw.close();
    }
}
