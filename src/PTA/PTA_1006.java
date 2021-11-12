package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/12 10:48 下午
 * FileName: PTA_1006
 */
public class PTA_1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //存储每位数
        int[] arr = new int[3];
        int i = 2;
        while (n != 0) {
            arr[i--] = n % 10;
            n /= 10;
        }
        //最朴实的输出。。。能过就行
        for (int j = 0; j < arr[0]; j++) {
            System.out.print("B");
        }
        for (int j = 0; j < arr[1]; j++) {
            System.out.print("S");
        }
        for (int j = 1; j <= arr[2]; j++) {
            System.out.print(j);
        }
    }
}
