package zxy.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * NIO包在JDK4出现
 *
 * JDK7滞后的nio
 *
 * Path：路径
 * Paths：有一个静态方法返回一个路径
 * Files：提供了静态方法供我们使用
 */
public class NIODemo {
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("name.txt"),new FileOutputStream("copy.txt"));
    }
}
