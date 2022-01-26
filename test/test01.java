import org.junit.Test;

import java.util.*;

/**
 * @author： hzm
 * @date： 2022/1/13 16:02
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class test01 {
    @Test
    public void testList()
    {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(i+" List");
        }
        System.out.println(strings.get(1));
        for (String s :strings) {
            System.out.println(s);
        }
        for (String s :strings  )
        {
            System.out.println(s);

        }

    }
    @Test
    public void SetTest()
    {
        Set<String> strings = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            strings.add(i+"");
        }
       Iterator iterator =  strings.iterator();
        while (iterator.hasNext())
        {
            System.out.println( iterator.next());

        }
//
//        for (int i = 0; i < 5; i++) {
//            strings.add(i+"");
//        }
//        for (String s :strings  )
//        {
//            System.out.println(s);
//
//        }


    }
    @Test
    public void Map()
    {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i+"",i+" map");

        }

        Iterator<Map.Entry<String,String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String,String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(map.get(i+""));
//        }


//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            String key = (String) entry.getKey();
//            String value = (String) entry.getValue();
//            System.out.println("Key = " + key + ", Value = " + value);
//
//
//        }
    }
}
