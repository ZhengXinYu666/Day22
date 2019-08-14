package zxy.test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * 有一个文本文件 数据是键值对形式的，不知道内容
 * 写一个程序判断是否有list这样的键存在，如果有就改变为“100”
 *
 * 分析：
 *      1、把文件中的数据加载到集合中
 *      2、遍历集合，获取得到每一个键
 *      3、判断键是否有为list的，如果有就修改其值为“100”
 *      4、把集合中的数据重新存储到文件中
 */
public class test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        Reader r = new FileReader("user.txt");
        prop.load(r);
        r.close();

        //遍历集合
        Set<String> set = prop.stringPropertyNames();
        for(String key:set){
            if("lisi".equals(key)){
                prop.setProperty(key,"100");
                break;
            }
        }
        //把集合中的数据重新存储到文件中
        Writer w = new FileWriter("user.txt");
        prop.store(w,null);
        w.close();
    }
}
