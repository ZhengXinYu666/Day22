package zxy.test;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    private String neme;
    private int age;

    public Person(){}

    public Person(String neme, int age) {
        this.neme = neme;
        this.age = age;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "neme='" + neme + '\'' +
                ", age=" + age +
                '}';
    }
}
