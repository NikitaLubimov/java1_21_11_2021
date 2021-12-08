package hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[]{
                new Cat("murzin", 10, false),
                new Cat("murka", 15, false),
                new Cat("titan", 50, false),
                new Cat("warik", 30, false),
                new Cat("rujuk", 5, false)
        };

        for (int i = 0; i <cats.length; i++) {
            cats[i].goEat(plate);
        }
        System.out.println(plate.getFood());
        System.out.println(cats[2].getSatiety());
    }
}
