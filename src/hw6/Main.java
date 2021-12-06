package hw6;

import hw6.animalss.Animals;
import hw6.animalss.Cat;
import hw6.animalss.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Dog dog1 = new Dog("Sharik");

        dog1.run(501);
        cat1.run(50);

        dog1.swim(11);
        cat1.swim(0);

        System.out.println(Animals.getQuantityAnimals());
        System.out.println(Cat.getQuantityCat());
        System.out.println(Dog.getQuantityDog());
    }
}
