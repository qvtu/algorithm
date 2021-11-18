package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/18 10:22 下午
 * FileName: PTA_1010
 */
public class PTA_1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //判断是不是零多项式
        int flag = 0;
        //输入值
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (m != 0) {
                //flag=0时说明是第一个数
                if (flag == 0) {
                    System.out.print(n * m + " " + (m - 1));
                } else {
                    System.out.print(" " + n * m + " " + (m - 1));
                }
                //flag++表示不是零多项式
                flag++;
            }
        }
        //如果数零多项式则输出0 0
        if (flag == 0) {
            System.out.print("0 0");
        }
    }
}
