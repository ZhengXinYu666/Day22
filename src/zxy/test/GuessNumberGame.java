package zxy.test;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;


public class GuessNumberGame {
    public static void main(String[] args) throws IOException {
        /**
         * 读取数据，如果次数不大于5 可以继续玩，否则就提示，试玩结束，请付费
         *
         */
        Properties prop = new Properties();
        Reader r = new FileReader("count.txt");
        prop.load(r);
        r.close();

        //自己的程序当然知道键是谁
       String value =  prop.getProperty("count");
       int number1 = Integer.parseInt(value);

       if(number1 > 5){
           System.out.println("试玩结束，请付费");
           System.exit(0);
       }else{
           number1++;
           prop.setProperty("count",String.valueOf(number1));
           Writer w = new FileWriter("count.txt");
           prop.store(w,null);
           w.close();


           GuessNumberGame.start();
       }



        GuessNumberGame.start();
}
    private GuessNumberGame(){}

    public static void start() {
        System.out.println("恭喜你进入了隐藏关卡，可以玩一把猜数字游戏");
        System.out.println("这个数字在1-100之间");
        System.out.println("游戏开始");
        //产生一个随机数
        int number = (int) (Math.random() * 100) + 1;

        //定义一个统计变量
        int count = 0;
        while (true) {
            //键盘录入一个数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            count ++;
            //判断
            if (guessNumber < number) {
                System.out.println("瓜怂，你猜小了");
            } else if (guessNumber > number) {
                System.out.println("瓷锤，你猜大了");
            } else {
                System.out.println("哎呀！猜了"+count+"次你狗势的终于猜中了！");
                break;
            }
        }
    }
}
