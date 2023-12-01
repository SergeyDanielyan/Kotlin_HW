package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysTasks {
    static Scanner in = new Scanner(System.in);

    public static int[] MakeArray() {
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        System.out.println("Введите элементы массива (каждый в новой строке):");
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void SortArrayDesc(int[] array) {
        Arrays.sort(array);
        // Переворачиваем массив
        for (int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = MakeArray();
        SortArrayDesc(array);
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
