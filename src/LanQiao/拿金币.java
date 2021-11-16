package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/15 8:27 上午
 * FileName: 拿金币
 */
public class 拿金币 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //定义N x N的方格
        int[][] dp = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                //输入原始数据
                dp[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    //如果是第一个格子 金币数不变
                } else if (i == 0) {
                    //如果是第一行格子 因为在最上面 所以最大值是加上 前一列的金币
                    dp[i][j] += dp[i][j - 1];
                } else if (j == 0) {
                    //如果是第一列格子 因为在最左边 所以最大值是加上 上一行的金币
                    dp[i][j] += dp[i - 1][j];
                } else {
                    //因为到一个格子有两种操作
                    //一种是上面的格子往下走
                    //一种是左边的格子往右走
                    //所以要判断哪一种操作可以让当前的格子得到最多的金币
                    int max = dp[i - 1][j];
                    if (dp[i][j - 1] > dp[i - 1][j]) {
                        max = dp[i][j - 1];
                    }
                    dp[i][j] += max;
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}