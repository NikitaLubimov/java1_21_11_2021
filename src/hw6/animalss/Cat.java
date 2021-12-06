package hw6.animalss;

public class Cat extends Animals {
    static int quantityCat;

    public Cat(String name) {
        super(name);
        quantityCat++;
    }

    @Override
    public void run(int a) {
        if (a <= 200) {
            System.out.println(name + " пробежал " + a + " м");
        } else {
            System.out.println(name + " может пробежать максимум 200м");
        }
    }

    @Override
    public void swim(int a) {
        if (true) {
            System.out.println(name + " не умеет плавать");
        }
    }

    public static int getQuantityCat() {
        return quantityCat;
    }
}
