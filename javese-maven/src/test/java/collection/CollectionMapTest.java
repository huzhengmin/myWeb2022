package collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author： hzm
 * @date： 2022/1/25 14:29
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class CollectionMapTest {
    @Test
    public void mapTest(){
        Map<Integer ,String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i,"name"+i);
        }
        map.put(2,"namePut2");
        Set<Integer> set = map.keySet();
        for (Integer i : set)
        {
            System.out.println("map  key = " + i + "  value" +map.get(i));
        }

        System.out.println("---------------");

        Iterator iterator = map.values().iterator();
                while (iterator.hasNext())
                {
                    System.out.println("value  "+iterator.next());
                }


        System.out.println(set.contains(1));
        System.out.println(set.contains(21));

    }
}
