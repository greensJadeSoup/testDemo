package text;


import java.util.*;

import redis.clients.jedis.Jedis;
public class Demo {
    private static Jedis jedis;
    static {
        jedis = new Jedis("47.96.191.33",6379);
        jedis.auth("abc123");
        System.out.println(jedis);
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        System.out.println(jedis.get("k1"));
        jedis.set("k55","v5");
        jedis.set("k45","v56");
        jedis.set("k213","v18");
        jedis.set("k252","v82");
        jedis.set("k25","v3");
        jedis.set("k3","v5");
        jedis.set("k27","v8");
       /* System.out.println(jedis.get("k5"));
        System.out.println(jedis.get("key11"));*/

        map.put("name","man");
        map.put("age","20");
        map.put("sex","boy");
        jedis.hmset("map",map);
        List<String> list = jedis.hmget("map","name","age","sex");

        /*//
        System.out.println("连接成功");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }*/
    }

}