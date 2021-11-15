package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/12 11:17 下午
 * FileName: 矩形面积交
 */
public class 矩形面积交 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //使用arr 存储两个矩形的相对坐标
        double[][] arr = new double[2][4];
        //使用arr2 存储相交部分的坐标
        double[] arr2 = new double[4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        //求相交部分的坐标 x1 y1 x2 y2
        arr2[0] = Math.max(Math.min(arr[0][0], arr[0][2]), Math.min(arr[1][0], arr[1][2]));
        arr2[1] = Math.max(Math.min(arr[0][1], arr[0][3]), Math.min(arr[1][1], arr[1][3]));
        arr2[2] = Math.min(Math.max(arr[0][0], arr[0][2]), Math.max(arr[1][0], arr[1][2]));
        arr2[3] = Math.min(Math.max(arr[0][1], arr[0][3]), Math.max(arr[1][1], arr[1][3]));
        //判断矩形是否正确
        if (arr2[0] < arr2[2] && arr2[1] < arr2[3]) {
            System.out.printf("%.2f\n", (arr2[2] - arr2[0]) * (arr2[3] - arr2[1]));
        } else {
            System.out.println("0.00");
        }
    }
}
