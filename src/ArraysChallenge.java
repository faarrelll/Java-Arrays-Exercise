import java.util.Arrays;

public class ArraysChallenge {
    public static void main(String[] args) {
        //soal 1
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        //soal 2
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));

        //soal 3
        int[] numbers3 = {10,20,30,40,50};
        System.out.println("Elemen pertama: " + numbers3[0]);
        System.out.println("Elemen pertama: " + numbers3[4]);

        //soal 4
        int[] numbers4 = {1,2,3,4,5};
        if(numbers4.length % 2 == 0){
            System.out.println("Length genap");
        } else {
            System.out.println("Length ganjil");
        }

        //soal 5
        //array dengan size 4
        int[] number5 = new int[4];
        for (int i = 0; i < number5.length; i++) {
            number5[i] = 7;
        }
        System.out.println(Arrays.toString(number5));

        //soal 6
        int[] number6 = {1,2,3,4,5};
        System.out.println(number6.length);

        //soal 7
        int[] number7 = {1,2,3,4,5,6};
        if((number7.length % 2 == 0)){
            System.out.println(number7[number7.length/2 -1]);
        } else {
            System.out.println(number7[number7.length/2]);
        }

        //soal 8
        String[] name = new String[3];
        name = new String[]{"Alice", "Bob", "Charlie"};
        System.out.println(Arrays.toString(name));

        //soal 9
        int[] number8 = {5,2,3,4,5};
        if(number8[0] == number8[number8.length-1]){
            System.out.println("Output: True");
        } else {
            System.out.println("Output: False");
        }

        //soal 10
        boolean[] booleansValue = new boolean[3];
        System.out.println(Arrays.toString(booleansValue));

        //soal 11
        int[] number9 = {1,2,3,4,5};
        reverseArray(number9);

        //soal12
        int[] number10 = {5, 2, 8, 1, 9};
        int sum =0;
        for (int i = 0; i < number10.length; i++) {
            sum += number10[i];
        }
        System.out.println(sum);

        //soal 13
        int[] number11 = {2, 5, 7, 8, 10, 13};
        int evenTotal = 0;
        for (int i = 0; i<number11.length; i++){
            if(number11[i] % 2 == 0){
                evenTotal +=1;
            }
        }
        System.out.println(evenTotal);

        //soal 14
        int[] numbers14 = {1, 2, 3, 4, 5};
        int[] numbers15 = numbers14.clone();
        numbers15[0] = 1;
        numbers15[1] = 1;
        numbers15[2] = 1;
        System.out.println(Arrays.toString(numbers14));
        System.out.println(Arrays.toString(numbers15));

        //soal 15
        int[][] matrix = new int[2][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void reverseArray(int[] input){
        for(int i = input.length-1; i >= 0; i--){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

}
