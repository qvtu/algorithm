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
        String[] arr = new String[4];
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] index = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }
        index = day(arr[0], arr[1]);
        String mm = mm(arr[2], arr[3]);
        String hh="";
        if (index[1]<10){
            hh="0"+index[1];
        }else {
            hh=""+index[1];
        }
        System.out.print(day[index[0]] + " " + hh + ":" + mm);
    }

    private static String mm(String s1, String s2) {
        String mm = "";
        int temp = 0;
        char[] t1 = s1.toCharArray();
        char[] t2 = s2.toCharArray();
        for (int i = 0; i < Math.min(t1.length,t2.length); i++) {
            if (t1[i] == t2[i] && ((t1[i] >= 'a' && t1[i] <= 'z') || (t1[i] >= 'A' && t1[i] <= 'Z'))) {
                temp = i;
                break;
            }
        }
        if (temp < 10) {
            mm = "0" + temp;
        } else {
            mm = "" + temp;
        }
        return mm;
    }

    private static int[] day(String s1, String s2) {
        int[] index = new int[2];
        char[] t1 = s1.toCharArray();
        char[] t2 = s2.toCharArray();
        char day = ' ';
        char hh = ' ';
        int indexi = 0;
        int flag = 0;
        for (int i = 0; i < t1.length; i++) {
                if (t1[i] == t2[i] && t1[i] >= 'A' && t1[i] <= 'G' && flag == 0) {
                    day = t1[i];
                    flag = 1;
                    indexi = i;
                }
                if (i > indexi && t1[i] == t2[i] && ((t1[i] >= 'A' && t1[i] <= 'N') || (t1[i] >= '0' && t1[i] <= '9')) && flag == 1) {
                    hh = t1[i];
                    flag = 2;

            }
            if (flag == 2) {
                break;
            }
        }
        index[0] = (int) day - 65;
        if (hh >= '0' && hh <= '9') {
            index[1] = hh - 48;
        } else {
            index[1] = hh - 55;
        }
        return index;
    }
}
