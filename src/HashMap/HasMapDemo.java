package HashMap;

import com.sun.javafx.collections.MappingChange;

import java.util.*;
/**
 * @author liwei
 * @create 2022-04-18-15:36
 * 用entrySet遍历map
 **/
public class HasMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","张三");
        map.put("3","张三");
        map.put("4","张三");
        map.put("5","张三");
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry =(Map.Entry)iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
