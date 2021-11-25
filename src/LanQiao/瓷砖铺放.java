package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/24 11:42 下午
 * FileName: 瓷砖铺放
 */
public class 瓷砖铺放 {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        fun(n);
        System.out.println(count);
    }


    public static void fun(int n) {
        //每一次调用铺一次
        if (n == 0) {
            //如果n==0 说明瓷砖已经铺满 铺法加1
            count++;
            return;
        }
        //如果n<0说明不能用这个所以返回
        if (n < 0) {
            return;
        }
        //使用长度1的瓷砖
        fun(n - 1);
        //使用长度2的瓷砖
        fun(n - 2);
    }
}
