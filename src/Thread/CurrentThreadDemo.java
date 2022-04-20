package Thread;

/**
 * java中所有的代码都是靠线程运行的，main方法也不例外。
 * java程序跑起来后，JVM会创建一条线程来执行main方法，这个线程的名字也叫"main",我们
 * 通常称呼它为"主线程"。
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//用于获取执行当前方法的线程
        System.out.println("主线程:"+main);
        dosome();//主线程调用dosome方法
    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是:"+t);
    }
}
