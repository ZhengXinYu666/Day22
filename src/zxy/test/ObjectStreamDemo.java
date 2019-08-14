package zxy.test;

import java.io.*;

/**
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输   对象----流                 写
 * 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象   流数据----对象       读
 *  Serializable
 * 该接口没有任何方法
 * 类似这种没有方法的接口被称为标记接口
 *
 * 实际开发中不可能每次都重新写入----id值不匹配
 * 每次修改java文件的内容的时候，class文件的id值都会发生改变
 * 读取文件的时候，回合class文件中的id值匹配---让这个id值编程一个固定的值----就可以修改文件而id值不改变了
 *
 * 加入transient修饰变量  变量不可以被序列化
 *
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        //序列化数据其实就是把对象写到文本文件
        //write();
        //反序列化
        read();
    }

    private static void write()throws IOException {
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

        //创建对象
        Person p = new Person("花木兰",27);

        oos.writeObject(p);

        oos.close();
    }

    private static void read()throws IOException,ClassNotFoundException{
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

        Object obj = ois.readObject();

        ois.close();

        System.out.println(obj);
    }

}
