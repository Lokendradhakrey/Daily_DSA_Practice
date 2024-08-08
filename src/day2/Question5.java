package day2;

// Given an array of names of the fruits,
// you are supposed to sort it in lexicographical order using the selection sort.

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        sort(fruits);
        System.out.println(Arrays.toString(fruits));
    }

    static void sort(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = 1 + i; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }

    }
}
