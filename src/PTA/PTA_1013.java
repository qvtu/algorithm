package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/17 12:05 上午
 * FileName: PTA_1013
 */
public class PTA_1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入M N
        int m = in.nextInt();
        int n = in.nextInt();
        //count记录素数个数
        int count = 0;
        //下面开始判断素数
        int i = 2;
        while (count < n) {
            int flag = 1;
            if (i % 2 == 0 && i != 2) {
                flag = 0;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
            }
            //flag=1说明i是素数
            if (flag == 1) {
                //如果count>m-2说明可以开始输出了
                if (count > m - 2) {
                    //如果count是最后一个数不加空格 每十个素数换行
                    if (count == n - 1) {
                        System.out.print(i);
                    } else if ((count - m + 2) % 10 > 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.println(i);
                    }
                }
                count++;
            }
            i++;
        }
    }
}