package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/14 12:25 上午
 * FileName: P0704
 */
public class P0704 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入min和max
        int min = in.nextInt();
        int max = in.nextInt();
        //存储答案
        int[] key = new int[max - min];
        int index = 0;
        //遍历min～max里的每个数
        for (int i = min; i < max + 1; i++) {
            //如果flag=1是质数
            int flag = 1;
            if (i % 2 == 0 && i > 2) {
                flag = 0;
            } else {
                //判断是不是质数
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
            }
            //如果数质数就判断是不是回文
            if (flag == 1) {
                String temp = String.valueOf(i);
                StringBuffer temp1 = new StringBuffer(temp);
                temp1.reverse();
                int count = 0;
                for (int j = 0; j < temp.length() / 2; j++) {
                    if (temp.charAt(j) == temp1.charAt(j)) {
                        count++;
                    }
                }
                //将答案存入key数组
                if (count == temp.length() / 2) {
                    key[index++] = i;
                }
            }
        }
        //输出答案
        for (int i = 0; i < key.length - 1; i++) {
            if (key[i] != 0 && key[i] != 1) {
                System.out.print(key[i]);
                if (key[i + 1] != 0) {
                    System.out.print(" ");
                }
            }
        }
    }
}
