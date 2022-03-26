package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/26 0026 18:29
 * FileName: 答疑
 */
public class 答疑 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < arr.length; i++) {
            int s = in.nextInt();
            int a = in.nextInt();
            int e = in.nextInt();
            arr[i][0] = s + a;
            arr[i][1] = e;
            arr[i][2] = s + a + e;
        }
        int[] time = new int[n];
        s_a_e_sort(arr);
        s_a_sort(arr);
        e_sort(arr);
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                time[i] = arr[i][0];
            } else {
                time[i] = time[i - 1] + arr[i - 1][1] + arr[i][0];
            }
            sum += time[i];
        }
        System.out.println(sum);
    }

    public static void s_a_e_sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][2] > arr[j + 1][2]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void s_a_sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][2] == arr[j + 1][2] && arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void e_sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][0] == arr[j + 1][0] && arr[j][1] > arr[j + 1][1]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
