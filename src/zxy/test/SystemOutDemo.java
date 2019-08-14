package zxy.test;

import java.io.PrintStream;

/**
 * 标准输入输出流
 * System类中的两个成员变量
 * public static finale InputStream in 标准输入流
 * public static finale PrintStream out 标准输出流
 *
 * InputStream is = System.in
 * PrintStream ps = System.out
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println("helloworld");
    }
}
