package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 9:20 下午
 * FileName: PTA_1003
 */
public class PTA_1003_卡题 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            ////使用str存储输入的字符串
            String str = in.nextLine();
            ////分割str
            //char[] arr = str.toCharArray();
            ////flag存储返回的字符串 arr_1存储PAT出现的次数
            //int arr_1[] = new int[3];
            //String flag = "YES";
            //for (char temp : arr) {
            //    String tstr = String.valueOf(temp);
            //    if (tstr.equals("P")) {
            //        arr_1[0] += 1;
            //    } else if (tstr.equals("A")) {
            //        arr_1[1] += 1;
            //    } else if (tstr.equals("T")) {
            //        arr_1[2] += 1;
            //    } else {
            //        flag = "NO";
            //    }
            //}
            //for (int j : arr_1) {
            //    if (j == 0) {
            //        flag = "NO";
            //    }
            //}
            System.out.println(str);
        }
    }
}
