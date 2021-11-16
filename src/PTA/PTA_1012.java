package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/16 1:29 下午
 * FileName: PTA_1012
 */
public class PTA_1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入整数并存储
        String[] str = in.nextLine().split(" ");
        double[] A = new double[5];
        //记录满足条件的个数
        int A2count = 0;
        int A4count = 0;
        //判断A1～5是否存在
        int [] flag = new int[5];
        for (int i = 1; i < str.length; i++) {
            int temp = Integer.valueOf(str[i]);
            if (temp % 5 == 0 && temp % 2 == 0) {
                A[0] += temp;
                flag[0]=1;
            } else if (temp % 5 == 1) {
                A[1] += Math.pow(-1, A2count) * temp;
                A2count++;
                flag[1]=1;
            } else if (temp % 5 == 2) {
                A[2]++;
                flag[2]=1;
            } else if (temp % 5 == 3) {
                A[3] += temp;
                A4count++;
                flag[3]=1;
            } else if (temp % 5 == 4) {
                if (temp > A[4]) {
                    A[4] = temp;
                    flag[4]=1;
                }
            }
        }
        //输出答案
        for (int i = 0; i < A.length; i++) {
            //如果不存在输出 N
            if (flag[i]==0){
                System.out.print("N");
            }else if (i!=3){
                System.out.printf("%d",(int)A[i]);
            }else {
                System.out.printf("%.1f",A[3]/A4count);
            }
            if (i!=4){
                System.out.print(" ");
            }
        }
    }
}
