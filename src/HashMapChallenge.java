import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

public class HashMapChallenge {
    public static void main(String[] args) {
        //Soal 1
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);

        //soal 2
        map.put("satu", 1);
        System.out.println(map);

        //soal 3
        Map<String, Integer> getValue = new HashMap<>(Map.of("apple",5));
        System.out.println(getValue.get("apple"));

        //soal 4
        Map<String,String> containsKey = new HashMap<>(Map.of("name","john"));
        System.out.println(containsKey.containsKey("name"));

        //soal 5
        Map<String, Integer> containsValue = new HashMap<>(Map.of("age",25));
        System.out.println(containsValue.containsValue(25));

        //soal 6
        Map<String,Integer> removeEntry = new HashMap<>(Map.of("A",1,"B",2));
        removeEntry.remove("A");
        System.out.println(removeEntry);

        //soal 7
        Map<String,Integer> sizeHashMap = new HashMap<>(Map.of("x",1,"y",2,"z",3));
        System.out.println(sizeHashMap.size());

        //soal 8
        Map<String,Integer> emptyHash = new HashMap<>();
        System.out.println(emptyHash.isEmpty());

        //soal 9
        Map<String,Integer> clearAllEntries = new HashMap<>(Map.of("a",1,"b",2,"c",3));
        clearAllEntries.clear();
        System.out.println(clearAllEntries);

        //soal 10
        Map<String,Integer> defaultValue = new HashMap<>(Map.of("count",5));
        System.out.println(defaultValue.getOrDefault("total",0));

        //soal 11
        Map<String, ?> printKeys = new HashMap<>(Map.of("nama","budi","usia",20));
        for (String v : printKeys.keySet()) {
            System.out.println(v);
        }

        //soal 12
        Map<String,Integer> printValues = new HashMap<>(Map.of("math",80, "science",85));
        for (int v : printValues.values()) {
            System.out.println(v);
        }

        //soal 13
        Map<String,Integer> multipleEntries = new HashMap<>();
        multipleEntries.putAll(Map.of("satu",1,"dua",2,"tiga",3));
        System.out.println(multipleEntries);

        //soal 14
        Map<String,Integer> copyAllEntries = new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> resultCopy = Map.copyOf(copyAllEntries);
        System.out.println(resultCopy);

        //soal 15
        Map<String,?> printAll = new HashMap<>(Map.of("nama","ani","nilai",90));
        for (String v : printAll.keySet()) {
            System.out.println("Key : "+v +" Value : "+printAll.get(v));
        }
    }
}
