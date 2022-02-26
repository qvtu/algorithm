package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/2/26 4:01 PM
 * FileName: 翻转旋转变换
 */
public class 翻转旋转变换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < arr.length; i++) {
            String t = in.next();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = t.charAt(j);
            }
        }
        int p = in.nextInt();
        for (int k = 0; k < p; k++) {

        }
    }

    public void one(char[][] arr) {
        //水平翻转

    }

    public void two(char[][] arr) {

    }

    public void there(char[][] arr) {

    }

    public void four(char[][] arr) {

    }
}
