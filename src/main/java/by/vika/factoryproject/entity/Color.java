package by.vika.factoryproject.entity;

public enum Color {

    RED(10),
    GREEN(20),
    BLUE(30),
    YELLOW(40);

    private final int popularity;

    Color(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }
}

