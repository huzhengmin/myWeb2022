package collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author： hzm
 * @date： 2022/1/25 14:29
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class CollectionSetTest {
    @Test
    public void setTest()
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add("name"+i);
        }
        set.add("name2");
        for (String s:set)
        {
            System.out.println(s);
        }
        System.out.println("----------------");
         Iterator iterator = set.iterator();
         while (iterator.hasNext())
         {
             System.out.println("set iterator  " + iterator.next());
         }

        System.out.println(set.contains("name3"));
        System.out.println(set.contains("name31"));
    }
}
