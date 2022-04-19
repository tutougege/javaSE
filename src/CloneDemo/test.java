package CloneDemo;

/**
 * @author liwei
 * @create 2022-03-25-9:35
 **/
public class test {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setSid(1);
        try {
            Student cloneS2 = (Student) s1.clone();
            System.out.println("s1==cloneS2 "+(s1==cloneS2));
            System.out.println("name==cloneName "+(s1.getName()==cloneS2.getName()));
            System.out.println("sid==cloneSid "+(s1.getSid()==cloneS2.getSid()));
        }catch(CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException"+e);
        }
    }
}
