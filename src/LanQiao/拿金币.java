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
        int[][] box = new int[n][n];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                box[i][j] = in.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = box[0][0];
                } else if(i==0){
                    dp[i][j] =dp[i][j-1]+box[i][j];
                }else if(j==0){
                    dp[i][j]=dp[i-1][j]+box[i][j];
                }else {
                    int max = dp[i-1][j];
                    if (dp[i][j-1]>dp[i-1][j]){
                        max=dp[i][j-1];
                    }
                    dp[i][j]=max+box[i][j];
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}
