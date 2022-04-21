package invocationHandler;

/**
 * @author liwei
 * @create 2022-04-21-10:38
 **/
public class main {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
