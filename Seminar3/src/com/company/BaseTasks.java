package com.company;

import java.util.Scanner;

public class BaseTasks {
    static Scanner in = new Scanner(System.in);


    public static void AskForInput() {
        // Ввод
        System.out.print("Введите свою фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите своё имя: ");
        String name = in.nextLine();
        System.out.print("Введите своё отчество: ");
        String patronym = in.nextLine();
        // Вывод
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronym);
    }

    public static double[] QuadraticRoots(double a, double b, double c) {
        // Дискриминант
        double D = b * b - 4 * a * c;
        if (D > 0) {
            return new double[] {(-b - Math.sqrt(D)) / (2 * a), (-b + Math.sqrt(D)) / (2 * a)};
        }
        if (D == 0) {
            return new double[] {-b / (2 * a)};
        }
        return new double[] {};
    }

    public static void PrintSameDigitNumbers() {
        for (int i = 1; i < 10; ++i) {
            // Все трёхзначные числа с совпадающими цифрами равны цифре, умноженной на 111
            System.out.print(111 * i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AskForInput();

        double[] roots = QuadraticRoots(-5.0, 4.0, 3.0);
        for (int i = 0; i < roots.length; ++i) {
            System.out.println("X" + (i + 1) + " = " + roots[i]);
        }

        PrintSameDigitNumbers();
    }
}
