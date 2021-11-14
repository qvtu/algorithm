package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 9:20 下午
 * FileName: PTA_1003
 */
public class PTA_1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            //输入字符串
            String str = in.next();
            //使用正则表达式判断 xPATx
            boolean flag = str.matches("A*PA+TA*");
            //获取P的地址
            int p = str.indexOf("P");
            //获取T的地址
            int t = str.indexOf("T");
            //计算aPbTc中A的数量
            int c1 = p;
            int c2 = t-p-1;
            int c3 = str.length()-c2-c1-2;
            //如果满足条件输出YES反之NO
            System.out.println(flag && (c1 * c2 == c3) ? "YES" : "NO");
        }
    }
}
