package PTA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/26 0026 8:36
 * FileName: PTA_1017
 */
public class PTA_1017 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //读取一行字符串用空格分割
        String[] s=bf.readLine().split(" ");
        //定义大数
        BigInteger a, b, q, r;
        //赋值
        a = new BigInteger(s[0]);
        b = new BigInteger(s[1]);
        //计算
        q=a.divide(b);
        r=a.remainder(b);
        System.out.print(q+" "+r);
    }
}