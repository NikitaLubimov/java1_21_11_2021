package hw1;

public class MainApp {
    public static void main(String[] args) {
        int[] arr6 = new int[]{6, 5, 2, 1, 4, 400, 0, -1, -20, 100, -200};
        print(arr5(5, 2));
        System.out.println(getMin(arr6));
        System.out.println(getMax(arr6));
        int[] arr = new int[]{0, 0, 0, 0, 1, 1, 1, 1};    // 1 задача
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr2 = new int[100];                         // 2 задача
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = new int[]{1, 2, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};       // 3 задача
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        int[][] arr4 = new int[5][5];                             // 4 задача
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                if (i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                }
                System.out.printf("%4d", arr4[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] arr5(int len, int initialValue) {         // 5 задача
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }

    public static void print(int[] arr) {                   // для себя метод что бы печатать масив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getMin(int[] array) {                 // 6 задача. 1 метод для нахождения минимального элемента
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < a) {
                a = array[i];
            }
        }
        return a;
    }

    public static int getMax(int[] array) {                 // 6 задача. 2 метод для нахождения максимального элемента
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        return a;
    }
}
/*
* На 7 и 8 задачу не хватило времени. Для себя в будущем обязательно сделаю.
* */