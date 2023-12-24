package lab3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class lab34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n;

        do {
            System.out.println("Введите натуральное число ");
            n = scanner.nextInt();
            if (n < 0){
                System.out.println("Введенное число не является натуральным ");
            }
        } while (n < 0);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(0, n);
        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arr_even = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr_even.add(arr[i]);
            }
        }

        System.out.println(arr_even);
    }
}
