package collection;

import org.junit.Test;

import java.util.*;

/**
 * @author： hzm
 * @date： 2022/1/25 14:16
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class CollectionArrayListTest {
    @Test
    public void CollectionArrayList()
    {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("name"+i);
        }
        list.add("name2");
        for (String s:list)
        {
            System.out.println("for  "+s);
        }
        System.out.println("-------------");

        Collections.sort(list, new Comparator<String>(){
            /*
             * int compare(Person p1, Person p2) 返回一个基本类型的整型，
             * 返回负数表示：p1 小于p2，
             * 返回0 表示：p1和p2相等，
             * 返回正数表示：p1大于p2
             */
            public int compare(String p1, String p2) {
                //按照Person的年龄进行升序排列
                if(p1.compareTo(p2)<0 ){
                    return 1;
                }
                if(p1  == p2 ){
                    return 0;
                }
                return -1;
            }
        });


        for (int i = 0; i < list.size(); i++) {
            System.out.println( "fori  "+list.get(i ));
        }
        System.out.println("-------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println("iterator  "+iterator.next());
        }

        System.out.println(list.contains("name3"));
        System.out.println(list.contains("name31"));
    }
}
