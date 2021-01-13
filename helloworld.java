/*
 * @author zhangxiaomin
 * @email 1396729865@qq.com
 */
import java.util.Map;
import java.util.HashMap;



public class helloworld
{



    public static void main(String[] args) {
        String[] strs = new String[]{{
        }};

        System.out.println(strs.toString());
    }



    public static void map_(String[] args) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put(null,"hello world");
        System.out.println(map);
    }

}


