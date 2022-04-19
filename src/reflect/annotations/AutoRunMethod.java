package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liwei
 * @create 2022-04-19-10:56
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunMethod {
    /*
    定义参数的格式为:
    格式:类型 参数名() [default 默认值]
    注:default可选，用于为当前参数定义默认值。如果不指定，则使用注解时必须为次参数赋值。
    例如:
    @AutoRunMethod(1)

    如果指定了默认值，则可以不指定参数，例如:
    @AutoRunMethod   此时注解中参数的使用default的默认值

 */
    //为注解定义一个int型的参数
    int value() default 1;
}
