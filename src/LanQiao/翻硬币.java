package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/7 0007 19:49
 * FileName: 翻硬币
 */
public class 翻硬币 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入字符串，并转换为字符数组
        char[] str1 = in.nextLine().toCharArray();
        char[] str2 = in.nextLine().toCharArray();
        //count记录操作次数
        int count=0;
        //遍历每一个字符
        for (int i =0;i<str1.length-1;i++){
            //如果str1和str2的字符不同则反转str1[i]和str1[i+1]
            if (str1[i]!=str2[i]){
                if (str1[i]!='*'){
                    str1[i]='*';
                }else {
                    str1[i]='o';
                }
                if (str1[i+1]!='*'){
                    str1[i+1]='*';
                }else {
                    str1[i+1]='o';
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
