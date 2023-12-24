package lab3;

import java.util.Random;
import java.util.Arrays;

public class lab33 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        boolean ascending = true;

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(10, 100);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < 4; i++) {
            if (arr[i - 1] > arr[i]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("Возрастает");
        } else {
            System.out.println("Не возрастает");
        }

    }
}
