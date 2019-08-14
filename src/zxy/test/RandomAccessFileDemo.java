package zxy.test;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机访问流
 *  是Object的子类
 *  支持对文件的随机访问和读取功能
 *
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException{
        //write();
        read();
    }

    private static void write() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");

        raf.writeInt(100);
        raf.writeChar('a');
        raf.writeUTF("中国");

        raf.close();
    }

    private static void read() throws  IOException{
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        int i = raf.readInt();
        System.out.println(i);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

        //不想从头读
        //seek设置
        raf.seek(4);
        ch = raf.readChar();
        System.out.println(ch);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

    }
}
