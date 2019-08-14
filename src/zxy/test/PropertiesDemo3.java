package zxy.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.Reader;
import java.util.Properties;

/**
 *
 * 这里的集合必须是Properties集合
 * public void load(Reader reader):把文件中的数据读取到集合中----文件的形式必须是键值对形式
 * public void store(Writer writer,String comments)：把集合中的数据存储到文件
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        Reader r = new FileReader("prop.txt");
        prop.load(r);
        r.close();


        System.out.println("prop:"+prop);
    }
}
