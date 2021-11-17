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
        int m = in.nextInt();
        int n = in.nextInt();
        int i = 2;
        int count = 0;
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
            if (flag == 1) {
                if (count > m - 2) {
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