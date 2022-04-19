package reflect.demo;

import reflect.annotations.AutoRunMethod;
import reflect.annotations.AutorunClass;

/**
 * @author liwei
 * @create 2022-04-18-10:57
 **/
@AutorunClass
public class Student {
    private String name;
    private int age;
    public Student() {
        System.out.println("Student类的无参构造");
    }
    public Student( String name, int age) {
        this.name = name;
        this.age = age;
    }
    @AutoRunMethod(3)
    public void sayHi(){
        System.out.println(name+"说hi");
    }
    @AutoRunMethod
    public void watchTV(){
        System.out.println(name+"正在看电视");
    }
    public void doSomeThing(String someThing){
        System.out.println(name+"正在"+someThing);
    }
    public void doSomeThing(String someThing,int count){
        for (int i = 1; i <= count; i++) {
            System.out.println(name+"正在做"+someThing+i+"次");
        }
    }
}
