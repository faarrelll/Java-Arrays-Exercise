import java.util.*;

public class SetChallenge {
    public static void main(String[] args) {
        //soal 1
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

        //soal 2
        List<String> checkName = new ArrayList<>(List.of("Budi", "Ani", "Budi", "Cindy"));
        Set<String> resultCheckName = new HashSet<>(checkName);
        System.out.println(checkName.size() != resultCheckName.size());

        //soal 3
        List<String> list1 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list2 = new ArrayList<>(List.of("B", "C", "D"));
        Set<String> resultCombineList = new HashSet<>(list1);
        resultCombineList.addAll(list2);
        System.out.println("resultCombineList: " + resultCombineList);

        //soal 4
        List<String> names = Arrays.asList("Ani", "Budi", "Ani", "Cindy", "Budi", "Dodi");
        Set<String> seenName = new HashSet<>();
        Set<String> duplicateName = new HashSet<>();
        for (String name : names) {
            if (!seenName.add(name)) {
                duplicateName.add(name);
            }
        }
        System.out.println(duplicateName);

        //soal 5
        List<String> email = new ArrayList<>(List.of("ani@gmail.com", "budi@yahoo.com", "cindy@gmail.com", "dodi@gmail.com"));
        HashMap<String, Integer> totalDomain = new HashMap<>();
        List<String> resultSplit = new ArrayList<>();
        for (String domain : email) {
            String result = domain.split("@")[1];
            totalDomain.put(result, totalDomain.getOrDefault(result, 0) + 1);
        }
        for (String domain : totalDomain.keySet()) {
            System.out.println(domain+": "+totalDomain.get(domain)+ " emails");
        }
    }
}
