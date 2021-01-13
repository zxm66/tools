/*
 * @author zhangxiaomin
 * @email 1396729865@qq.com
 */

import java.io.File;
import java.util.Arrays;

public class RenameChildDir{
    public static void main(String[] args) {
        String oldName = args[0];
        String newName = args[1];

        File file = new File("./");
        String path = file.getAbsolutePath()+"/";
        System.out.println(path);
        String[] list = file.list();
        Arrays.stream(list).forEach((a)->{
            System.out.println(a);
            if(a.equals(oldName)){
                new File(path + a)
            }

        });
        System.out.println(file.list());

    }
}


