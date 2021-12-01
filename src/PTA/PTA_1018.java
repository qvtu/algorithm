package PTA;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/1 0001 9:03
 * FileName: PTA_1018
 */
public class PTA_1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        String[][] arr = new String[n][2];
        String wina = "";
        String winb = "";
        String pj="";
        for (int i = 0; i < arr.length; i++) {
            String a = in.next();
            String b = in.next();
            if (a.equals(b)) {
                pj += a;
            } else if (a.equals("C")) {
                if (b.equals("J")) {
                    wina += a;
                } else {
                    winb += b;
                }
            } else if (a.equals("J")) {
                if (b.equals("C")) {
                    winb += b;
                } else {
                    wina += a;
                }
            } else if (a.equals("B")) {
                if (b.equals("C")) {
                    wina += a;
                } else {
                    winb += b;
                }
            }
        }
        System.out.println(wina.length()+" "+pj.length()+" "+winb.length());
        System.out.println(winb.length()+" "+pj.length()+" "+wina.length());

    }
}