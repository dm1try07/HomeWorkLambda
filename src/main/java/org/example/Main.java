package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //1. Найти минимальный элемент массива
//        Func func = (arr) -> {
//            int min = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < min)
//                    min = arr[i];
//            }
//            return min;
//        };
//        int[] arr = {11, 5, 9, 4, 2, 1, 7};
//        System.out.println(func.find(arr));

        //2. Найти второй по величине элемент массива
//        Func func = (arr) -> {
//            int max = arr[0];
//            int max2 = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//                else if (arr[i] > max2 && arr[i] < max){
//                    max2 = arr[i];
//                }
//            }
//            return max2;
//        };
//        int[] arr = {4, 5, 1, 9, 2, 3, 7};
//        System.out.println(func.find(arr));

        //3. Найти самую часто встречающуюся букву в строке
//        Func2 func2 = (string) -> {
//            HashSet<Character> hashSet = new HashSet<>();
//            for (var elem : string.toLowerCase().toCharArray()) {
//                hashSet.add(elem);
//            }
//            System.out.println(hashSet);
//            String simbol = " ";
//            int maxCount = 0;
//            for (var elem : hashSet) {
//                int count = 0;
//                for (int i = 0; i < string.length(); i++) {
//                    if (elem.equals(string.toLowerCase().charAt(i)) && elem != ' ') {
//                        count++;
//                    }
//                }
//                if (count >= maxCount) {
//                    simbol = simbol.valueOf(elem);
//                    maxCount = count;
//                }
//            }
//            return simbol;
//        };
//        String string = "Hello world, i love java";
//        System.out.println(func2.find(string));


        //4. Отсортировать лист со строками в лексикографическом порядке, т.е по алфавиту
        Func2 func2 = (string) -> {
            String list = " ";
            String arr[] = string.split(" ");
            TreeSet<String> treeSet = new TreeSet<>();
            for(var elem: arr)
                treeSet.add(elem);
            for(var elem: treeSet){
                list += elem + " ";
            }
            return list;
        };
        String string = "Hello world, i love java";
        System.out.println(func2.find(string));
    }
}