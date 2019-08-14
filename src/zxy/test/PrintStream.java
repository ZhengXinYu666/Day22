package zxy.test;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 打印流
 * 字节流打印流   PrintStream
 * 字符打印流    PrintWriter
 *
 * 打印流的特点：
 *      1、只有写数据的，没有读数据的。只能操作目的地，不能操作数据源
 *      2、可以操作任意类型的数据
 *      3、如果启动了自动刷新，能够自动刷新
 *      4、可以直接操作文本文件的流
 *          哪些流对象可以直接操作文本文件呢？
 *              FileInputStream
 *              FileOutputStream
 *              FileReader
 *              FileWriter
 *              PrintStream
 *              PrintWriter
 *              看API查看流对象的构造方法，如果同时File类型和String类型的参数，一般来说是可以直接操作文件的
 *
 *     流：
 *          基本流：能够直接读写文件的
 *          高级流：在基本流基础上提供了一些其他的功能
 */
public class PrintStream {
    public static void main(String[] args)throws IOException {
        //作为Writer子类使用
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.write("hello");
        pw.write("world");
        pw.write("java");

        pw.close();
    }
}
