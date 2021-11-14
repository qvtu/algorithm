package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/14 8:35 下午
 * FileName: PTA_1008
 */
public class PTA_1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入数组长度 和 位移距离
        int n = in.nextInt();
        int m = in.nextInt();
        //数组A
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        //有可能位移距离大于数组长度所以取余
        m %= n;
        //从n-m开始输出
        for (int i = n - m; i < 2 * n - m - 1; i++) {
            System.out.print(A[(i % n)] + " ");
        }
        System.out.print(A[((2 * n - m - 1) % n)]);
    }
}
