import java.io.File;
import java.util.Date;

/*
 * @author zhangxiaomin
 * @email 1396729865@qq.com
 */

public class Finder{
    public static void main(String[] args) throws Exception {
        findFile(args[1],args[0]);
    }
    public static void findFile(String path,String fileName) throws Exception{
        File file = null;
        if(!(file = new File(path)).isDirectory()){
            throw new Exception("who is it");
        }
        path = file.getAbsolutePath()+"/";
        String[] dirs = file.list();
        for (int i = 0; i < dirs.length; i++) {
            if(dirs[i].matches(fileName)){
                System.out.println(path + dirs[i]);
            }else if(new File(path+dirs[i]+"/").isDirectory()){
                findFile(new String(path+dirs[i]+"/"), fileName);
            }
        }
    }
}
