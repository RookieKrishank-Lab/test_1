package Collection;


import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Dog {
    String color;

    Dog(String c) {
        color = c;
    }
    public String toString(){
        return color + " dog";
    }
}
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("White", 10);
        hashMap.put("Xerox", 15);
        hashMap.put("White", 2);
        hashMap.put("Hill", 15);
//        hashMap.put("Xerox", 21);
//        hashMap.put("Bag", 27);

////print size
//        System.out.println(hashMap.size());
//
////loop HashMap
//        for(Map.Entry m : hashMap.entrySet()){
       for(Map.Entry<String,Integer> m : hashMap.entrySet()) {
           System.out.println(m.getKey() + " " + m.getValue());
       }
       }

}
