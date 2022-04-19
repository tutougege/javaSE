package CloneDemo;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author liwei
 * @create 2022-03-25-9:35
 **/
public class Student implements Cloneable {
    private int sid;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
