package data;

import java.util.Date;
import java.util.Set;

/**
 * @author liwei
 * @create 2022-03-26-10:45
 **/
public class DataDemo {
    public static void main(String[] args) {
        Date date1 = new Date();//无参构造自动调用当前时间的构造方法
        Date date2 = new Date(1000);//从java元年开始过了多少毫秒 1000毫秒为1秒
        System.out.println(date1);
        System.out.println(date2);
        long d1 =  date1.getTime();
        long d2 =  date2.getTime();
        System.out.println(d1);
        System.out.println(d2);
        date1.setTime(d2);
        date1.setTime(d1);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("d1 before d2 "+date1.before(date2));
        //before返回值为boolean 参数为Date对象
        System.out.println("d2 before d1 "+date2.before(date1));
        System.out.println("d1 after d2 "+date1.after(date2));
        //after返回值为boolean 参数为Date对象
        System.out.println("d2 after d1 "+date2.after(date1));
        date1.getYear();
    }
}
