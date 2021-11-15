package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/11 10:03 下午
 * FileName: 单词分析
 */
public class 单词分析 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入字符串
        String str = in.nextLine();
        //使用数组存储字符出现个数
        int[] arr = new int[26];
        //字符串转字符数组
        char[] ch_str = str.toCharArray();
        //统计出现次数
        for (char temp : ch_str) {
            arr[(int) temp - 97] += 1;
        }
        //记录次数最多字符的下标 max记录次数
        int index = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println((char) (index+97));
        System.out.print(arr[index]);
    }
}
