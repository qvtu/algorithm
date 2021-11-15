package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/14 10:37 下午
 * FileName: 印章
 */
public class 印章 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n和m
        int n = in.nextInt();
        int m = in.nextInt();
        //定义p代表每一次的概率
        double p = 1.0 / n;
        //定义dp数组 dp[m][n] 买m张凑齐n种
        double[][] dp = new double[m + 1][n + 1];
        //i代表买了i张 j代表凑齐j种
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //因为i<j 不可能买了i张凑齐j种 所以dp=0；
                if (i < j) {
                    dp[i][j] = 0;
                } else if (j == 1) {
                    //如果j=1 买了i张凑齐j种 所以dp=p的i-1次方
                    dp[i][j] = Math.pow(p, i - 1);
                } else {
                    //其他情况 买了i张凑齐j种 第i张有两种情况 第一种和之前凑齐的一样 第二种和之前凑齐的不一样
                    dp[i][j] = dp[i - 1][j] * (j * p) + dp[i - 1][j - 1] * ((n - j + 1) * p);
                }
            }
        }
        System.out.printf("%.4f", dp[m][n]);
    }
}
