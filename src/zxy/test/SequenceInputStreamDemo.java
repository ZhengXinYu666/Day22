package zxy.test;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 把下面的三个文件复制到Copy.txt中
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args)throws IOException {
        //SequenceInputStream sis = new SequenceInputStream();
        Vector<InputStream> v = new Vector<>();
        InputStream s1 = new FileInputStream("dos.txt");
        InputStream s2 = new FileInputStream("pw.txt");
        InputStream s3 = new FileInputStream("pw2.txt");
        v.add(s1);
        v.add(s2);
        v.add(s3);
        Enumeration<InputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Copy.txt")
        );

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=sis.read(bys))!= -1){
            bos.write(bys,0,len);
        }
        bos.close();
        sis.close();

    }
}
