package lab1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.0 Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * 1.1 Реализуйте алгоритм сортировки пузырьком для сортировки массива
 * */

public class Main {
    public static void main(String[] args) {
        primeNum(100);

        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        int length = in.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            arr[i] = (int) (Math.random() * 99);

        numbers(arr);
        arr = bubblesort(arr);

        System.out.print("Bubble sort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

    }

    /**
     * Print MAX, MIN and AVG numbers
     * */
    public static void numbers(int[] a) {
        int max = a[0], min = a[0], avg = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
            if (min > a[i])
                min = a[i];
            avg += a[i];
        }
        avg /= a.length;

        System.out.println("MAX number: " + max + '\n' + "MIN number: " + min + '\n' + "AVG number: " + avg + '\n');
    }

    /**
     * Return the sorted array
     * */
    public static int[] bubblesort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int max = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = max;
                }
            }
        }
        return a;
    }

    public static void primeNum(int n) {
        boolean[] a = new boolean[n];
        Arrays.fill(a, true);

        a[0] = false;
        a[1] = false;
        for (int i = 2; i < a.length; i++) {
            int p = i;
            for (int j = i; j < a.length; j++) {
                if (i * j >= a.length)
                    break;
                if (i * j % p == 0)
                    a[i * j] = false;
            }
            if (a[i])
                System.out.print(i + ", ");
        }
    }
}