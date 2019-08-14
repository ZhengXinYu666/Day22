package zxy.test;

import java.util.Properties;
import java.util.Set;

/**
 * 特殊功能：
 *
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("张三","30");
        prop.setProperty("李四","40");
        prop.setProperty("王五","50");

        Set<String> set = prop.stringPropertyNames();
        for(String key:set){
            String value = prop.getProperty(key);
            System.out.println(key+"---"+value);
        }

    }
}

