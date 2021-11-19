package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/18 10:39 下午
 * FileName: PTA_1014
 */
public class PTA_1014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //存储数据
        String[] arr = new String[4];
        //存储星期的英语单词
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        //存储day 和 hh
        int[] index = new int[2];
        //输入字符串
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }
        //调用day mm 方法
        index = day(arr[0], arr[1]);
        String mm = mm(arr[2], arr[3]);
        String hh = "";
        //hh补零
        if (index[1] < 10) {
            hh = "0" + index[1];
        } else {
            hh = "" + index[1];
        }
        //输出
        System.out.print(day[index[0]] + " " + hh + ":" + mm);
    }

    private static String mm(String s1, String s2) {
        //将字符串转为字符数组
        char[] t1 = s1.toCharArray();
        char[] t2 = s2.toCharArray();
        String mm = "";
        int temp = 0;
        for (int i = 0; i < Math.min(t1.length, t2.length); i++) {
            //判断mm
            if (t1[i] == t2[i] && ((t1[i] >= 'a' && t1[i] <= 'z') || (t1[i] >= 'A' && t1[i] <= 'Z'))) {
                temp = i;
                break;
            }
        }
        //mm补零并且返回
        if (temp < 10) {
            mm = "0" + temp;
        } else {
            mm = "" + temp;
        }
        return mm;
    }

    private static int[] day(String s1, String s2) {
        //将字符串转为字符数组
        char[] t1 = s1.toCharArray();
        char[] t2 = s2.toCharArray();
        int[] index = new int[2];
        char day = ' ';
        char hh = ' ';
        int flag = 0;
        for (int i = 0; i < t1.length; i++) {
            //判断hh
            if (t1[i] == t2[i] && ((t1[i] >= 'A' && t1[i] <= 'N') || (t1[i] >= '0' && t1[i] <= '9')) && flag == 1) {
                hh = t1[i];
                flag = 2;

            }
            //判断day的下标
            if (t1[i] == t2[i] && t1[i] >= 'A' && t1[i] <= 'G' && flag == 0) {
                day = t1[i];
                flag = 1;
            }
            if (flag == 2) {
                break;
            }
        }
        //day和hh转换后存入index数组并且返回
        index[0] = (int) day - 65;
        if (hh >= '0' && hh <= '9') {
            index[1] = hh - 48;
        } else {
            index[1] = hh - 55;
        }
        return index;
    }
}