package classwork_12;

import homework_8.Animal;
import homework_8.pets.impl.Dog;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>(); // якщо нічого не вказати, то за замовчцванням буде <Object>
        strings.add("some string");
      //  strings.add(10);

       // int k;
       // Integer number = Integer.valueOf(12);

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        int k = 7;
        Integer number = k;

        Collection<Animal> animals = new ArrayList<>();
        //animals.add(new Dog());

    }
}
