package by.vika.factoryproject.entity;

public class Animal {
    private static long idCounter = 0;
    private long id;
    private int age;
    private double weight;
    private Color color;

    public Animal(int age, double weight, Color color) {
        this.id = generateId();
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    private synchronized long generateId() {
        return idCounter++;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Animal{id}=%d, age=%d, weight=%.2f, color=%s}", id, age, weight, color);
    }
}
