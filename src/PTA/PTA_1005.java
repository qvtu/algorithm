package PTA;

import java.io.BufferedInputStream;
import java.util.*;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 11:52 下午
 * FileName: PTA_1005
 */
public class PTA_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //存放待验证的数
        int[] arr = new int[n];
        //关键数
        int[] key = new int[n];
        int count = 0;
        //创建HashSet存储计算的数字
        HashSet hs = new HashSet();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            int temp = arr[i];
            //PTA-1001的代码
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = (3 * temp + 1) / 2;
                }
                //存储每一次计算后的数
                hs.add(temp);
            }
        }
        for (int i = 0; i < n; i++) {
            //判断列表中是否有输入的数字
            if (!hs.contains(arr[i])) {
                //若有输入的数字不存在哈希表中，将其放入数组key
                key[count] = arr[i];
                count++;
            }
        }
        //将关键字排序
        Arrays.sort(key);
        //输出答案
        for (int i = key.length - 1; i >= 0; i--) {
            if (key[i] != 0) {
                System.out.print(key[i]);
            }
            if (i != 0 && key[i - 1] != 0) {
                System.out.print(" ");
            }
        }
    }
}
