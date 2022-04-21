package invocationHandler;

/**
 * @author liwei
 * @create 2022-04-21-9:54
 *  JDK 动态代理类使用步骤
 *
 *     定义一个接口及其实现类；
 *     自定义 InvocationHandler 并重写invoke方法，在 invoke 方法中我们会调用原生方法（被代理类的方法）并自定义一些处理逻辑；
 *     通过 Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法创建代理对象；
 **/
public class SmsServiceImpl implements SmsService {
    public String send(String send){
        System.out.println("send:"+send);
        return send;
    }
}
