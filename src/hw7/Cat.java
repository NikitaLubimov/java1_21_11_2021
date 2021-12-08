package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void goEat(Plate plate) {
        if (plate.removeFood(appetite) == true) {
            satiety = true;
            System.out.println("Cat " + name + " покушал...");
        } else {
            satiety = false;
            System.out.println("Cat " + name + " не смог покушать");
        }
    }
}
