package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/6 0006 19:21
 * FileName: 车的放置
 */
public class 车的放置 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        //
        int[] flag = new int[n];
        dfs(0, flag);
        System.out.println(count);
    }

    public static int count = 1;

    public static void dfs(int step, int[] flag) {
        if (step > flag.length-1) {
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]==0){
                flag[i]=1;
                count++;
                dfs(step+1,flag);
                flag[i]=0;
            }
        }
        dfs(step+1,flag);
    }
}
