package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/10 11:24 下午
 * FileName: PTA_1004
 */
public class PTA_1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //输入学生信息
        String[][] stu = new String[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                stu[i][j] = in.next();
            }
        }
        //保存最高分和最低分的序号和分数
        int maxindex = 0;
        int minindex = 0;
        int max = Integer.parseInt(stu[0][2]);
        int min = Integer.parseInt(stu[0][2]);
        for (int i = 0; i < n; i++) {
            //简单的判断
            if (Integer.parseInt(stu[i][2])>max){
                max=Integer.parseInt(stu[i][2]);
                maxindex=i;
            }
            if (Integer.parseInt(stu[i][2])<min){
                min=Integer.parseInt(stu[i][2]);
                minindex=i;
            }
        }
        //输出答案
        System.out.println(stu[maxindex][0]+" "+stu[maxindex][1]);
        System.out.println(stu[minindex][0]+" "+stu[minindex][1]);
    }
}
