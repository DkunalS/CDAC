package day05_28_09_2024.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap
{
    public static void main(String[] args) {
        Map<String, Integer> map =new HashMap<>();
        map.put("Kunal", 101);
        map.put("Omen", 202);
        map.put("Ram", 303);
        map.put("Daksh",404);
        map.put("Dhruv",505);

        System.out.println(map.get("Kunal"));
        System.out.println("--------------------");


        Set<String> keyset = map.keySet();

        for(String key : keyset)
        {
            System.out.println(key+" -> "+map.get(key));
        }
        System.out.println("--------------------");
        Set<Entry<String, Integer>> entries = map.entrySet();

        for(Entry<String, Integer> entry : entries)
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("--------------------");
        map.remove("Daksh");
        keyset = map.keySet();
        for(String key : keyset)
        {
            System.out.println(key+" -> "+map.get(key));
        }
    }
}
