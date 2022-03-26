package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/26 0026 17:28
 * FileName: 天干地支
 */
public class 天干地支 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String[] tg = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};
        String[] dz = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};
        int year = in.nextInt();
        int i = 6;
        int j = 0;
        int t = year - 2020;
        if (year >= 2020) {
            i = (i + t) % 10;
            j = (j + t) % 12;
        } else {
            i = 9 - Math.abs(i + t) % 9;
            j = 11 - Math.abs(j + t) % 11;
        }
        System.out.println(tg[i] + dz[j]);

    }
}
