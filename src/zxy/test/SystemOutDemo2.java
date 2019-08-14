package zxy.test;
import java.io.*;
import java.io.PrintStream;

public class SystemOutDemo2 {
    public static void main(String[] args) throws IOException {
//        //PrintStream ps = System.out;
//        OutputStream os = System.out;//多态
//
//        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("hello");
        bw.newLine();
        bw.write("hellowold");
        bw.newLine();
        bw.write("java");
        bw.flush();
    }
}
