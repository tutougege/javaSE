package reflect.annotations;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liwei
 * @create 2022-04-19-9:24
 * 注解
 * 注解在开发中常被我们利用到反射机制中，辅助反射机制做更多灵活的操作
 * 注解在如今JAVA流行的框架中被大量的应用，简化了以前繁琐的配置工作。
 * 注解可以在:
 * 类上，属性上，方法上，构造器上，以及参数上使用
 * 可以通过java内置的注解@Target来说明当前注解可以被应用的位置，对应的值被定义在ElementType上
 * 例如:
 * @Target(ElementType.TYPE) 注解只能被用于类上
 * @Target({ElementType.TYPE,ElementType.METHOD}) 注解只能被用于类上或方法上
 * 当可以用于多个位置时，需要定义成数组的方式包含所有ElementType的值，即"{}"包含
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutorunClass {

}
