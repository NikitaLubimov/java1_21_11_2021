package hw6.animalss;

public class Dog extends Animals {
    static int quantityDog;

    public Dog(String name) {
        super(name);
        quantityDog++;
    }

    @Override
    public void run(int a) {
        if (a <= 500) {
            System.out.println(name + " пробежал " + a + " м");
        } else {
            System.out.println((name + " может пробежать максимум 500м"));
        }
    }

    @Override
    public void swim(int a) {
        if (a <= 10) {
            System.out.println(name + " проплыл " + a + " м");
        } else {
            System.out.println(name + " может проплыть максимум 10м");
        }
    }

    public static int getQuantityDog() {
        return quantityDog;
    }
}
