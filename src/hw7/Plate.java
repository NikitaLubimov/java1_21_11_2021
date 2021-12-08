package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int pourFood(int a) {
        food += a;
        return food;
    }

    public boolean removeFood(int a) {
        if (food - a >=0 ) {
            food -= a;
            return true;
        }
        return false;
    }
}