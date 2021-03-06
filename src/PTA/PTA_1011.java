package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/16 1:06 下午
 * FileName: PTA_1011
 */
public class PTA_1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //存入数据
        long[][] arr = new long[n][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextLong();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            //判断并且输出
            if (arr[i][0] + arr[i][1] > arr[i][2]) {
                System.out.println("Case #" + (i + 1) + ": true");
            } else {
                System.out.println("Case #" + (i + 1) + ": false");
            }
        }
    }
}