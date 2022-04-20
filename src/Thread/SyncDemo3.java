package Thread;

/**
 * 静态方法上如果使用synchronized，那么该方法一定是同步的。
 *
 * 静态方法上指定的锁对象为当前类的类对象，即Class类的实例。
 * 在JVM中每个被加载的类都有且只有一个Class的实例与之对应，它称为一个类的类对象。
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
//    public synchronized static void dosome(){
    public static void dosome(){
        //静态方法中使用同步块时，也可以指定类对象，方式为:类名.class
        synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕!");
            } catch (InterruptedException e) {
            }
        }
    }
}




