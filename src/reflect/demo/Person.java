package reflect.demo;

/**
 * @author liwei
 * @create 2022-04-18-10:30
 **/
public class Person {
    private String name = "张三";
    private int age = 30;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("Person类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHi(){
        System.out.println(name+"说hi");
    }
    public void sayHello(){
        System.out.println(name+"说hello");
    }
    public void watchTV(){
        System.out.println(name+"正在看电视");
    }
    public void doSomeThing(String someThing){
        System.out.println(name+"正在"+someThing);
    }
    private void doSome(){
        System.out.println("私有方法doSome()");
    }
    public void doSomeThing(String someThing,int count){
        for (int i = 1; i <= count; i++) {
            System.out.println(name+"正在做"+someThing+i+"次");
        }
    }
}
