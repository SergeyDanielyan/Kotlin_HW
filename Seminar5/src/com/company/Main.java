package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        PetContainer<Pet> container = new PetContainer<Pet>();
        for (int i = 0; i < 10; ++i) {
            int x = random.nextInt(2);
            if (x == 0) {
                container.PutIntoContainer(new Cat("cat" + i));
            } else {
                container.PutIntoContainer(new Cat("dog" + i));
            }
        }

        Pet myPet = container.HearVoice();
        System.out.print("Введите 0, если считаете, что это собака и 1, если считаете, что это кошка: ");
        int ind = in.nextInt();
        if (myPet.getClass() == Cat.class) {
            if (ind == 0) {
                System.out.println("Вы не узнали своего питомца.");
            } else {
                System.out.println("Поздравляем, вы узнали!");
            }
        } else {
            if (ind == 1) {
                System.out.println("Вы не узнали своего питомца.");
            } else {
                System.out.println("Поздравляем, вы узнали!");
            }
        }
    }
}
