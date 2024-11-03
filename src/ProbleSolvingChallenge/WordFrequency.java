package ProbleSolvingChallenge;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        countWords("A B C B A A");
    }
    public static Map<String, Integer> countWords(String sentence) {
        Set<String> set = new HashSet<>(List.of(sentence.split(" ")));
        List<String> key = new ArrayList<>(set);
        Collections.sort(key);
        Map<String, Integer> map = new HashMap<>();
        String[] comparator = sentence.split(" ");
//        System.out.println(key);
        key.forEach(value->{
//            System.out.println(value);
            int count = 0;
            for (String v : comparator){
                if(value.equals(v)){
                    count++;
                }
            }
            map.put(value, count);
        });

        key.forEach(keys-> System.out.println(keys + ": " + map.get(keys)));

        return map;
    }

}
