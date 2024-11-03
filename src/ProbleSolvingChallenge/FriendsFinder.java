package ProbleSolvingChallenge;

import java.util.*;

public class FriendsFinder {
    public static void main(String[] args) {
        List<String> friends1 = new ArrayList<>(List.of("Budi", "Charlie", "David", "Eve"));
        List<String> friends2 = new ArrayList<>(List.of("Charlie", "David", "Frank", "Grace"));
        String name1 = "Farrel";
        String name2 = "Ridho";
        findFriends(friends1,friends2,name1,name2);
    }
    public static void findFriends(List<String> friends1, List<String> friends2, String name1, String name2) {
        Set<String> mutualFriendSet = new HashSet<>(friends1);
        mutualFriendSet.retainAll(friends2);

        List<String> mutualFriend = new ArrayList<>(mutualFriendSet);

        friends1.removeAll(mutualFriendSet);
        friends2.removeAll(mutualFriendSet);

        Collections.sort(friends1);
        Collections.sort(friends2);

//        for (String friend1 : friends1) {
//            for (String friend2 : friends2) {
//                if (friend1.equals(friend2)) {
//                    mutualFriend.add(friend1);
//                }
//            }
//        }
//        friends1.removeAll(mutualFriend);
//        friends2.removeAll(mutualFriend);

        System.out.println("mutualFriend: " + mutualFriendSet);
        System.out.println("unique to "+name1+" : "+ friends1);
        System.out.println("unique to "+name1+" : " + friends2);

        //
    }

}
