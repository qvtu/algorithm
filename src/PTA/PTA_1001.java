package PTA;

import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/9 11:59 下午
 * FileName: PTA_1001
 */
public class PTA_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入n
        int n = in.nextInt();
        //用count记录次数
        int count = 0;
        //while循环
        while (n != 1) {
            //如果n是偶数n/2,如果是奇数(3n+1)/2
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}