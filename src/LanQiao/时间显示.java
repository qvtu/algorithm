package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/30 0030 19:17
 * FileName: 时间显示
 */
public class 时间显示 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        long time = in.nextLong();
        long h, m, s;
        //毫秒->秒
        time /= 1000;
        //取模只留下时分秒
        time = time % (24 * 60 * 60);
        //时分秒
        h = time / 60 / 60;
        m = time / 60 % 60;
        s = time % 60;
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}
