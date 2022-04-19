package file;

import java.io.File;

/**
 * @author liwei
 * @create 2022-03-25-9:56
 *
 **/
    /*
    class File{
        public String getName()//返回当前路径下的文件名字
        public long length();//获得当前引用的文件长度(就是当前文件在硬盘上占用的空间) 单位字节(byte)
        public boolean canWrite()//判断文件是否可写
        public boolean canRead()//判断文件是否可读
        public boolean isHidden()//判断文件是否隐藏
        public viod createNwwFile()//在当前目录下创建一个文件，如路径不存在则抛出异常
        public void delete()//删除当前(目录)文件并且必须是空目录 或删除文档
        public void mkdir()//使用File创建一个目录(windows里面叫文件夹) 就是makeDirectory的意思 createNewFile创建一个文档
        public void mkdirs()//创建一个目录 只要不存在 则自动创建一个
        public File[] listFiles()//插卡当前目录所有子项 返回一个File数组
          ***listFiles()重载允许我们传入一个文件过滤器，并在过滤器上定义过滤条件,
          ***之后listFiles执行完毕后会将目录所有满足过滤器要求偶的子项进行返回
        public boolean isFile();//判断当前目录是否为一个文件
        public boolean isDirectory();//判断当前File表示的是否一个目录
        }
    */
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("./demo.txt");
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
    }
}
