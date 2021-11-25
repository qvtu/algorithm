package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/26 0026 0:17
 * FileName: PTA_1016
 */
public class PTA_1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //用字符数组存入A B 用字符存入Da Db
        char[] a = in.next().toCharArray();
        char Da = in.next().charAt(0);
        char[] b = in.next().toCharArray();
        char Db = in.next().charAt(0);
        //用字符串存储Pa Pb
        String Pa = "0";
        String Pb = "0";
        //遍历字符串数组寻找和Da相同的字符 存入Pa
        for (char t : a){
            if (t==Da){
                Pa+=t;
            }
        }
        for (char t : b){
            if (t==Db){
                Pb+=t;
            }
        }
        //将Pa Pb转为int类型相加输出
        System.out.println(Integer.parseInt(Pa)+Integer.parseInt(Pb));
    }
}
