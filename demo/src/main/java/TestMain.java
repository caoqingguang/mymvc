import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by caoqingguang on 2016/4/8.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(""));
        JSONObject json=JSON.parseObject("");
        System.out.println(json==null);
    }
}
