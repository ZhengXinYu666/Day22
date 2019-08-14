package zxy.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 内存操作流
 *  用于处理临时存储信息的，程序结束，数据就从内存中消失
 *
 * 操作字节数组
 *  ByteArrayOutputStream
 *  ByteArrayInputStream
 * 操作字符数组
 *  CharArrayReader
 *  CharArrayWriter
 * 操作字符串
 *  StringReader
 *  StringWriter
 */
public class Demo {
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //写数据
        for(int x = 0; x<10;x++){
            baos.write(("hello"+x).getBytes());
        }
        //释放资源,通过查看源码知道这里什么都没做，根本不需要close
        //baos.close();
        //读数据
        byte[] bys = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);

        int by = 0;
        while((by =bais.read())!= -1){
            System.out.print((char)by);
        }

    }
}
