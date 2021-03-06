package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/14 1:26 上午
 * FileName: PTA_1007
 */
public class PTA_1007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //存储满足条件的个数
        int count = 0;
        //使用temp存储上一个素数的值
        int temp = 1;
        //查找素数
        for (int i = 2; i <= n; i++) {
            int flag = 1;
            if (i != 2 && i % 2 == 0) {
            } else {
                for (int j = 3; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    //与上一个数比较
                    if (i - temp == 2) {
                        count++;
                    }
                    temp = i;
                }
            }
        }
        System.out.println(count);
    }
}
