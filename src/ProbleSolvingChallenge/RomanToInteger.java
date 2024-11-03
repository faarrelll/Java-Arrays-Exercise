package ProbleSolvingChallenge;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String input) {
        Map<String, Integer> map = new HashMap<>(Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000));
       List<String> roman = new ArrayList<>();
        int result=0;
        for (int i = 0; i < input.length(); i++) {
            roman.add(String.valueOf(input.charAt(i)));
        }
        System.out.println(roman);
        for (int i = 0; i < roman.size(); i++) {
            if (i < roman.size() - 1 && map.get(roman.get(i)) < map.get(roman.get(i + 1))) {
                result -= map.get(roman.get(i));
            } else {
                result += map.get(roman.get(i));
            }
        }
        return result;
    }

}
