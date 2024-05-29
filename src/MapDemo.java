import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }

        entrySet.forEach((me) -> {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        });
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> me = iterator.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
        map.forEach((key, value) -> {
            System.out.println(key + "," + value);
        });
        new HashMap<>();
        new TreeMap<>();
    }
}
