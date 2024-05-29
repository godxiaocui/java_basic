import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //获取一个文件
        File file = new File("/Users/godxiaocui/Library/Mobile Documents/com~apple~CloudDocs/java_hotel/java_basic/puzzlegame/image/win.png");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.length());
        File file1 = new File("puzzlegame/image/win.png");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());

        File f = new File("/Users/godxiaocui/Library/Mobile Documents/com~apple~CloudDocs/java_hotel/java_basic/puzzlegame/image/aaa.txt");
        System.out.println("是否存在:"+f.exists()); // false
        System.out.println("是否创建:"+f.createNewFile()); // true
        System.out.println("是否存在:"+f.exists()); // true
    }
}
