package io;

import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;
import com.sun.prism.GraphicsPipeline;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.cert.TrustAnchor;
import java.util.Scanner;

/**
 * @author liwei
 * @create 2022-03-28-15:56
 **/
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =  new FileOutputStream("test.txt");
        String input;
        while (!("exit".equals((input = new Scanner(System.in).nextLine())))){
            input = input+"\n";
            byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        }

    }
}
