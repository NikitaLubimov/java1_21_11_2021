package hw1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(test1(5, 6));
        test2(-5);
        System.out.println(test3(5));
        test4("Привет", 2);
        System.out.println(test5(1996));
    }

    public static boolean test1(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void test2(int a) {
        if (a < 0) {
            System.out.println("Переданое число отрицательное");
        } else {
            System.out.println("Переданое число положительное");
        }
    }

    public static boolean test3(int a) {
        return a <= 0;
    }

    public static void test4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean test5(int a) {
        if (a % 4 != 0) {
            return false;
        } else if (a % 100 != 0) {
            return true;
        } else if (a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
