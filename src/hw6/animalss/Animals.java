package hw6.animalss;

public abstract class Animals {
    String name;
    static int quantityAnimals;

    public Animals(String name) {
        this.name = name;
        quantityAnimals++;
    }

    public abstract void run(int a);

    public abstract void swim(int a);

    public static int getQuantityAnimals() {
        return quantityAnimals;
    }
}
