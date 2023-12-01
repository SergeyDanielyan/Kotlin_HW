package com.company;

import java.util.ArrayList;
import java.util.Random;

public class PetContainer<T> {
    ArrayList<T> pets;

    PetContainer() {
        pets = new ArrayList<T>();
    }

    void PutIntoContainer(T pet) {
        pets.add(pet);
    }

    T HearVoice() {
        Random random = new Random();
        int index = random.nextInt(pets.size());
        System.out.println("A pet’s voice came through the container: " + pets.get(index).toString()
                + ". Сan you guess who this is?");
        return pets.get(index);
    }
}
