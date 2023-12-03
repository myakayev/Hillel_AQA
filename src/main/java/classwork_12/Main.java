package classwork_12;

import homework_8.Animal;
import homework_8.birds.non_flying_birds.impl.Duck;
import homework_8.birds.non_flying_birds.impl.Penguin;
import homework_8.pets.impl.Cat;
import homework_8.pets.impl.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>(); // якщо нічого не вказати, то за замовчцванням буде <Object>
        strings.add("some string");
       // strings.add(10);
       // int k;
       // Integer number = Integer.valueOf(12);
        Animal cat = new Cat("Vova", "green", "Anya");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Grisha", "red", "Sviatopolk"));
        animals.add(new Penguin("Kolia", "yellow"));
        animals.add(new Duck("Sveta", "purple"));
//        for (Animal animal : animals){
//            animal.voice();
//        }
        Map<String, Animal> animalMap = new HashMap<>();
        for (Animal animal : animals) {
            animalMap.put(animal.getName(), animal);
        }
        System.out.println(animalMap.getOrDefault("hf", cat));
        System.out.println(animalMap);
        System.out.println(animalMap.keySet());
    }
}
