package LanQiao;

import java.io.BufferedInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/21 11:21 PM
 * FileName: 幂方分解
 */
public class 幂方分解 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入N
        int n = in.nextInt();
        dg(n,0);
    }

    public static void dg(int n, int i) {
        if (n == 1) {
            if (i>2){
                dg(i,0);
            }else {
                System.out.println(i);
            }
            return;
        }
        if (n % 2 != 0) {
            double t = Math.pow(2, i);
            n = (int) (n * t - t);
            if (i>2){
                dg(i,0);
            }else {
                System.out.println(i);
            }
            i = 0;
            dg(n, i);
        } else {
            i++;
            n = n / 2;
            dg(n, i);
        }
    }
}
