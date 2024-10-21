package com.COMP2024;

import java.util.ArrayList;
import java.util.List;

public class Compounds {
    private String name;
    private List<Animal> animals;
    public Compounds() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


}
