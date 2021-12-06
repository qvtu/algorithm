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
        //输入n
        int n = in.nextInt();
        //定义n行
        int[] flag = new int[n];
        //使用dfs从第0行开始搜索
        dfs(0, flag);
        //输出答案
        System.out.println(count);
    }
    //因为不放车也是一种情况所以count默认为1

    public static int count = 1;

    public static void dfs(int step, int[] flag) {
        //step代表放下的个数 如果超过数量则返回
        if (step > flag.length-1) {
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            //判断是否已经放下了
            if (flag[i]==0){
                flag[i]=1;
                count++;
                //搜索下一个位置
                dfs(step+1,flag);
                //回溯
                flag[i]=0;
            }
        }
        dfs(step+1,flag);
    }
}
