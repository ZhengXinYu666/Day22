package zxy.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 可以操作任意类型的数据
 *      print
 *      println
 *   启动自动刷新
 *   必须调用println的方法才可以
 *   这个时候不仅仅自动刷新了，还实现了数据的换行
 *
 *   println方法其实等价于之前的
 *   bw.write()
 *   bw.newLine()
 *   bw.flush()
 */
public class PrintStreamDemo  {
    public static void main(String[] args)throws IOException {
        //创建打印流对象
        //PrintWriter pw = new PrintWriter("pw2.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
        //write方法无法搞定
        pw.println(true);
        pw.println(100);
        pw.println("hello");

    }
}
