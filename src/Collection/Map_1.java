package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();             //  here if we use TreeMap the key will be printed in ordered manner

        map.put("One",1);
        map.put("Two", 2);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);

        System.out.println(map);                                // as it is a hashMap there is no order in printing the numbers

        if (!map.containsKey("One")){
            map.put("one",111);
        }

//        map.putIfAbsent("One",111);                           // putIfAbsent and containsKey perform the same task

        System.out.println(map);

        /*
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue() );
        }*/
        System.out.println(map.containsValue(3));
        System.out.println(map.isEmpty());
    }
}
