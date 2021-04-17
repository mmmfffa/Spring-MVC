import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mf.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mf
 * @create 2021-04-16-14:57
 */
public class MyTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        User user1 = new User("马1",3,"男");
        User user2 = new User("马2",3,"男");
        User user3 = new User("马3",3,"男");
        User user4 = new User("马4",3,"男");
        users.add(user1);users.add(user2);users.add(user3);users.add(user4);
//       json对象转json字符串
        System.out.println("JSON.toJSONString(users)=>"+JSON.toJSONString(users));
//        json字符串转java对象
        System.out.println("JSON.parseObject(JSON.toJSONString(user1), User.class)=>"+JSON.parseObject(JSON.toJSONString(user1), User.class));
//        java对象转json对象
        JSONObject jsonObject=(JSONObject)JSON.toJSON(user1);
        System.out.println("jsonObject.getString()=>"+jsonObject.getString("name"));
//        json对象转java对象
        System.out.println("JSON.toJavaObject(jsonObject, User.class)=>"+JSON.toJavaObject(jsonObject, User.class));


    }
}
