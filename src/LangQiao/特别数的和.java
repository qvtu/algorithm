package LangQiao;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 9:05 下午
 * FileName: 特别数的和
 */

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 特别数的和 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //使用sum记录数的和
        int sum = 0;
        //使用循环判断每个数是否包含'2' '0' '1' '9'
        for (int i = 1; i < n + 1; i++) {
            //将数字转换为String类型
            String temp = "" + i;
            //将数字分割
            char[] arr = temp.toCharArray();
            //判断数字里是否包含'2' '0' '1' '9'
            for (char j : arr) {
                //如果出现'2' '0' '1' '9'
                if (j == '2' || j == '0' || j == '1' || j == '9') {
                    //将sum加上i 并跳出循环 判断下一个数
                    sum += i;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}

