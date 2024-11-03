package ProbleSolvingChallenge;

import org.w3c.dom.ls.LSInput;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        firstUniqChar("leetcode");        // Output: 0
        firstUniqChar("loveleetcode");    // Output: 2
        firstUniqChar("aabb");            // Output: -1
        firstUniqChar("aabbaaccddeexxzz");// Output: -1
        firstUniqChar("stress");          // Ou
    }

    public static int firstUniqChar(String s) {
        List<String> input = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            input.add(String.valueOf(s.charAt(i)));
        }
        input.forEach(v-> map.put(v, map.getOrDefault(v, 0) + 1));

        for (int i = 0; i < s.length(); i++) {
            if (map.get(input.get(i)) == 1) {
                System.out.println(i + " (karakter "+"'"+input.get(i)+"'"+ " adalah karakter pertama yang tidak berulang)");
                return i;
            }
        }
        System.out.println(-1 + " (semua karakter berulang)");
        return -1;
    }

}
