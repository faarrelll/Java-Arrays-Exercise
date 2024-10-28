import java.util.*;

public class ArraysListChallenge {
    public static void main(String[] args) {
        //soal 1
        List<String> emptyArray = new ArrayList<String>();
        System.out.println(emptyArray);

        //soal 2
        String[] arr = {"A","B","C"};
        emptyArray = Arrays.asList(arr);
        System.out.println(emptyArray);

        //soal3
        Integer[] arr1 = {1,2,3};
        List<Integer> arrayList = List.of(arr1);
        System.out.println(arrayList);

        //soal 4
        List<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);

        //soal 5
        List<String> list2 = Arrays.asList("X", "Y", "Z");
        System.out.println(list2.size());

        //soal 6
        List<String> list3 = List.of("Red", "Blue");
        boolean check = list3.contains("Red");
        System.out.println(check);

        //soal 7
        List<String> arraysListDefault = new ArrayList<>(20);
        System.out.println(arraysListDefault);

        //soal 8
        List<String> addToIndex = new ArrayList<>(List.of("A", "C"));
        addToIndex.add(1,"B");
        System.out.println(addToIndex);

        //soal 9
        addToIndex.removeIf(s -> s.equals("B"));
        //addToIndex.remove(1);
        System.out.println(addToIndex);

        //soal 10
        List<String> getElemenet = new ArrayList<>(List.of("X", "Y", "Z"));
        System.out.println(getElemenet.get(1));

        //soal 11
        List<String> names = new ArrayList<>();
        names = new ArrayList<>(List.of("Charlie","Alice","Bob"));
//        names.sort(String::compareTo);
        Collections.sort(names);
        System.out.println(names);

        //soal 12
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(numbers);
        System.out.println(numbers);

        //soal 13
        List<Integer> scores = Arrays.asList(85, 90, 75, 95, 80);
        System.out.println("Nilai Tertinggi : "+Collections.max(scores));
        System.out.println("Nilai Terendah : "+Collections.min(scores));

        //soal 14
        List<Integer> values = new ArrayList<>(List.of(75, 80, 85, 90, 70));
        Collections.sort(values);
        Collections.reverse(values);
        System.out.println("Nilai diurutkan : "+values);
        System.out.print("Tiga nilai tertinggi : ");
        double average = 0.0;
        for(int i = 0; i <3; i++){
            System.out.print(values.get(i)+", ");
            average += values.get(i);
        }
        System.out.println();
        average /=  3;
        System.out.println("Rata-rata nilai: "+average);

        //soal 15
        List<String> name = new ArrayList<>(List.of("Budi","Ani","Cindy","Doddy"));
        System.out.println("List awal : "+name);
        name.add(0,"Eko");
        System.out.println("Setelah tambah eko : "+name);
        Collections.sort(name);
        System.out.println("Setelah diurutkan : "+name);
        System.out.print("nama dengan awalan A atau B : ");
        for (String i: name){
            if (i.startsWith("A") || i.startsWith("B")){
                System.out.print(i+" ");
            }
        }
    }
}
