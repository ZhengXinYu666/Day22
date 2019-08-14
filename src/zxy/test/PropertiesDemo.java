package zxy.test;

import java.util.Properties;
import java.util.Set;

/**
 * Properties：属性集合类，是一个可以和IO流结合使用的集合类
 * 可以保存在流中或从流中加载，属性列表中的每个键及其对应值都是一个字符串
 *
 * 是Hashtable的子类，说明是一个Map集合
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //作为Map结合的使用
        //一定要看API 如果没有<>说明该类没有泛型
        Properties prop = new Properties();
        //添加元素
        prop.put("it002","hello");
        prop.put("it001","world");
        prop.put("it003","java");

        //遍历集合
        Set<Object> set = prop.keySet();
        for(Object key:set){
            Object value = prop.get(key);
            System.out.println(key+"---"+value);
        }
    }

}
