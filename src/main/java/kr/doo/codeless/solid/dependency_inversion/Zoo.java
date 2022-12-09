package kr.doo.codeless.solid.dependency_inversion;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void speakAll() {
        for (Animal animal : animals) {
            System.out.println(animal.speak());
        }
    }
}
