package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liwei
 * @create 2022-04-20-16:07
 * 线程池
 * 线程池是线程的管理机制，它主要解决两方面问题:
 * 1:复用线程
 * 2:控制线程数量
 **/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        /*
        JUC java.util.concurrent包
        concurrent 并发
        java的并发包，里面都是关于线程的api,线程池就在这个包里
         */
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"正在执行任务...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"执行完毕");
                }
            });
        }
    }
}
