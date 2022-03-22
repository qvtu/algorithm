package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/21 11:21 PM
 * FileName: 幂方分解
 */
public class 幂方分解 {
    public static String str = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入N
        int n = in.nextInt();
        dg(n, 0, 0);
        str = str.replace("+)", ")");
        for (int i = 0;i<str.length()-1;i++){
            System.out.print(str.charAt(i));
        }
    }

    public static void dg(int n, int pow, int t) {
        if (n == t) {
            return;
        }
        while (t * 2 <= n) {
            t = (int) Math.pow(2, pow);
            pow++;
        }
        pow -= 1;
        if (pow >= 3) {
            str += "2(";
            dg(pow, 0, 0);
        } else {
            if (pow == 1) {
                str += "2";
            } else {
                str += "2(" + pow;
            }
        }
        if (pow == 1) {
            str += "+";
        } else {
            str += ")+";
        }
        dg(n - t, 0, 0);
    }
}
