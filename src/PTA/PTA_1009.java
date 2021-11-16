package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/16 12:29 下午
 * FileName: PTA_1009
 */
public class PTA_1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入字符串
        String str = in.nextLine();
        //分割字符串变成字符串数组
        String [] str1 = str.split(" ");
        //倒着输出数组
        for (int i = str1.length-1;i>0;i--){
            System.out.print(str1[i]+" ");
        }
        System.out.println(str1[0]);
    }
}
