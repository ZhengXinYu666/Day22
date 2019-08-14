package zxy.test;

import java.io.*;

/**
 * 操作基本类型的流
 * 数据输出流，允许应用程序以适当方式将基本的Java数据类型写入输出流中，然后，应用程序可以使用数据输入流将数据读入
 */
public class DataStreamDemo {
    public static void main(String[] args)throws IOException {
        //写
        write();
        //读
        read();
    }
    private static void write() throws IOException{
        //创建数据输入流对象
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
        dos.writeByte(10);
        dos.writeInt(1000);
        dos.writeLong(10000);
        dos.writeFloat(12.34f);
        dos.writeDouble(12.56);
        dos.writeChar('a');
        dos.writeBoolean(true);
    }

    private static void read() throws IOException{
        //创建数据输出流对象
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
        byte b = dis.readByte();
        int s = dis.readInt();
        char c = dis.readChar();
        boolean bb = dis.readBoolean();

        dis.close();

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(bb);

    }


}
