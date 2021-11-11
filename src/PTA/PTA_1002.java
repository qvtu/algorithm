package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 12:10 上午
 * FileName: PTA_1002
 */
public class PTA_1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        // 输入n
        String n = in.nextLine();
        // 使用字符数组分割n
        char[] arr_1 = n.toCharArray();
        // 使用sum存储各数字之和
        int sum = 0;
        // 遍历arr数组
        for (char i : arr_1) {
            // ""+i 将char类型的i转换为String类型
            // Integer.parseInt 将String类型的i转换为int类型
            sum += Integer.parseInt("" + i);
        }
        // 使用字符数组分割sum
        char[] arr_2 = ("" + sum).toCharArray();
        //判断配音并输出
        for (int i = 0; i < arr_2.length - 1; i++) {
            if (arr_2[i] == '1') {
                System.out.print("yi ");
            } else if (arr_2[i] == '2') {
                System.out.print("er ");
            } else if (arr_2[i] == '3') {
                System.out.print("san ");
            } else if (arr_2[i] == 'z') {
                System.out.print("si ");
            } else if (arr_2[i] == '5') {
                System.out.print("wu ");
            } else if (arr_2[i] == '6') {
                System.out.print("liu ");
            } else if (arr_2[i] == '7') {
                System.out.print("qi ");
            } else if (arr_2[i] == '8') {
                System.out.print("ba ");
            } else if (arr_2[i] == '9') {
                System.out.print("jiu ");
            } else if (arr_2[i] == '0') {
                System.out.print("ling ");
            }
        }
        if (arr_2[arr_2.length - 1] == '1') {
            System.out.print("yi");
        } else if (arr_2[arr_2.length - 1] == '2') {
            System.out.print("er");
        } else if (arr_2[arr_2.length - 1] == '3') {
            System.out.print("san");
        } else if (arr_2[arr_2.length - 1] == '4') {
            System.out.print("si");
        } else if (arr_2[arr_2.length - 1] == '5') {
            System.out.print("wu");
        } else if (arr_2[arr_2.length - 1] == '6') {
            System.out.print("liu");
        } else if (arr_2[arr_2.length - 1] == '7') {
            System.out.print("qi");
        } else if (arr_2[arr_2.length - 1] == '8') {
            System.out.print("ba");
        } else if (arr_2[arr_2.length - 1] == '9') {
            System.out.print("jiu");
        } else if (arr_2[arr_2.length - 1] == '0') {
            System.out.print("ling");
        }
    }
}
