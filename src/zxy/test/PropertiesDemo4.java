package zxy.test;

import java.io.*;
import java.util.Properties;

/**
 *
 * 这里的集合必须是Properties集合
 * public void load(Reader reader):把文件中的数据读取到集合中----文件的形式必须是键值对形式
 * public void store(Writer writer,String comments)：把集合中的数据存储到文件
 */
public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("林青霞","27");
        prop.setProperty("花木兰","30");
        prop.setProperty("公孙离","18");

        Writer w = new FileWriter("name.txt");
        prop.store(w,"hellworld");

        System.out.println("prop:"+prop);
        w.close();
    }
}
