import com.alibaba.fastjson.JSON;

public class JsonUtil {
    public static void test()
    {
        User user = new User();
        user.setAge(11);
        user.setName("xiaoming");
        user.setSex(1);
        System.out.println(JSON.toJSON(user));

        System.out.println(JSON.parseObject("{\"sex\":1,\"name\":\"xiaoming\",\"age\":11}",User.class));
    }

    public static void main(String[] args) {
        test();
    }
}
