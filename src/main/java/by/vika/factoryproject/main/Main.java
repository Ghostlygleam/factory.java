package by.vika.factoryproject.main;

import by.vika.factoryproject.entity.Cat;
import by.vika.factoryproject.util.AnimalFactory;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = AnimalFactory.getInstance();
        ArrayList<Cat> cats = new ArrayList<Cat>();

        for (int i = 0; i < 10; i++) {
            cats.add(factory.createCat());
        }
        System.out.println("Original list of cats:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        cats.sort(Comparator.comparingInt(Cat::getAge));

        System.out.println("\nSorted list of cats:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }


}
