package Homework11;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        fillArray(array);
        sortByDecrease(array);
        sortByIncrease(array);

    }

    private static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
    }

    private static void sortByDecrease(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer integer : array) {
            System.out.print(integer);
        }
    }
    private static void sortByIncrease(Integer[] array){
        Arrays.sort(array);
        for (Integer integer : array) {
            System.out.print(integer);
        }
    }
}

