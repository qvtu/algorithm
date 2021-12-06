package LanQiao;

import java.util.HashSet;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/6 0006 21:40
 * FileName: 猜年龄
 */
public class 猜年龄 {
    public static void main(String[] args) {
        for (int i = 11; i < 50; i++) {
            //判断条件
            if (Math.pow(i, 3) <= 9999 && Math.pow(i, 3) >= 1000 & Math.pow(i, 4) >= 100000 && Math.pow(i, 4) < 999999) {
                //用字符串存储
                String a = "" + (int)Math.pow(i, 3);
                String b = "" + (int)Math.pow(i, 4);
                String s =a+b;
                //将字符数组每一个值存入hs
                HashSet hs = new HashSet();
                char []st=s.toCharArray();
                for (int j=0;j<s.length();j++){
                    hs.add(st[j]);
                }
                //如果hs==10说明有0-9
                if (hs.size()==10){
                    System.out.println(i);
                }
            }
        }
    }
}
