package zxy.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * System.in 标准输入流 是从键盘获取数据的
 *
 * 键盘录入数据：
 *      A:main方法的args接收参数
 *          java HelloWorld hello world java
 *      B:Scanner(JDK1.5)
 *          Scanner sc = new Scanner(System.in)
 *          String s = sc.nextLine()
 *          int i = sc.nextInt()
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //获取标准输入流
//        InputStream is = System.in;
//
//        //一次获取一行
//        //字符缓冲流只能对字符操作，而这个是字节流，所以会报错，需要把字节流转换为字符流
//        //BufferedReader br = new BufferedReader(is);
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是"+i);
    }
}
