package invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liwei
 * @create 2022-04-21-10:23
 **/
public class DebugInvocationHandler implements InvocationHandler {
    private final Object result;

    public DebugInvocationHandler(Object result) {
        this.result = result;
    }
/*
invoke() 方法有下面三个参数：

    proxy :动态生成的代理类
    method : 与代理类对象调用的方法相对应
    args : 当前 method 方法的参数
 */
    public Object invoke(Object proxy, Method method, Object[] args){
        return result;
    }
    /*
    invoke() 方法: 当我们的动态代理对象调用原生方法的时候，最终实际上调用到的是 invoke() 方法
    ，然后 invoke() 方法代替我们去调用了被代理对象的原生方法。
     */
}
