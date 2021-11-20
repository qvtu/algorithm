package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 秘密行动 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[][] dp = new int[n + 1][2];
        //第一层的两种状态 0-爬 1-跳
        dp[1][0] = arr[1];
        dp[1][1] = 0;
        for (int i = 2; i <= n; i++) {
            //0-爬 所以判断上一步 爬 和 跳 哪一个长度短再加上当前爬的时间
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i];
            //因为能力只能跳一层或跳两层并且不能连续使用 所以比较上一步爬和上上步哪一个长度短
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 2][0]);
        }
        //输出答案
        System.out.println(Math.min(dp[n][0], dp[n][1]));
    }
}
