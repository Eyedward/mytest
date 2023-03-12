import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 集合概述
 * Map是一个接口，我们不能直接创建对象，可以通过多态的形式创建对象，Map中有两个参数，一个是K表示键，一个是V表示值，且一个键有且对应一个值，Map中不能包含重复的键
 *若是有重复的键添加，则会以最后一次的键为准，而其他的键会被覆盖。集合都在
 */

public class MapTest {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("2001","张三");
        map.put("2002","李四");
        map.put("2003","王五");
        System.out.println(map);

        //根据键删除元素
        //  map.remove("2001");
        //System.out.println(map);//{2003=王五, 2002=李四}
        //判断集合中是否包含指定的键返回boolean类型
        System.out.println(map.containsKey("2001"));//true
        System.out.println(map.containsKey("2004"));//false
        //判断集合中是否包含指定的值返回boolean类型
        System.out.println(map.containsValue("张三"));//true
        System.out.println(map.containsValue("赵六"));//false
        //判断集合是否为空返回boolean类型
        System.out.println("集合是否为空:"+map.isEmpty());//false
        //得到集合的长度
        System.out.println("集合长度:"+map.size());//3
        //清除所有键值对
        // map.clear();
        //System.out.println(map.isEmpty());//true，为空了

        //遍历map集合
        //方式一:Set keySet();获取键的集合
        Set<String> keySet = map.keySet();
        for (String key:keySet) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

        /**
         * Set keySet = map.keySet();
         * Iterator it = keySet.iterator();
         * while(it.hasNext()) {
         * Object key = it.next();
         * Object value = map.get(key);
         * System.out.println(key+":"+value);
         * }
         */
        System.out.println("\n---------");

        //方式二:Set entrySet();//取的是键和值的集合（映射关系）
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> me:entrySet) {
            //分别得到键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+":"+value);
        }
        /**
         * Set entrySet = map.entrySet();
         * Iterator it = entrySet.iterator();
         * while(it.hasNext()) {
         * Map.Entry me = (Map.Entry)it.next();
         * System.out.println(me.getKey()+"::::"+me.getValue());
         * }
         */
    }
}

