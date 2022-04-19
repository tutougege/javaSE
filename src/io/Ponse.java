package io;

import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author liwei
 * @create 2022-03-29-10:21
 **/
public class Ponse implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;//姓名
    private int age;//年龄
    private String gender;//性别
    private transient String[] otherInfo;//当一个对象被transient修饰时，序列化时该对象会被忽略
                                        //忽略不必要的属性可以使对象瘦身，减少资源开销

    public Ponse(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public Ponse(){}
    @Override
    public String toString() {
        return "Ponse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }
}
