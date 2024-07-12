package by.vika.factoryproject.util;

import by.vika.factoryproject.entity.Cat;
import by.vika.factoryproject.entity.Color;


public class AnimalFactory {
    private static AnimalFactory instance;

    private AnimalFactory() {
    }

    public static synchronized AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Cat createCat() {
        int age = (int) (Math.random() * 15) + 1;
        double weight = Math.random() * 10 + 1;
        Color color = Color.values()[(int) (Math.random() * Color.values().length)];
        return new Cat(age, weight, color);
    }
}
