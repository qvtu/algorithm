package LangQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/14 10:03 下午
 * FileName: P1102
 */
public class P1102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入学生个数
        int n = in.nextInt();
        //stu存储姓名、性别、年龄 stucj存储成绩和排名
        String[][] stu = new String[n][3];
        int[][] stucj = new int[n][3];
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[0].length; j++) {
                stu[i][j] = in.next();
            }
            stucj[i][0] = in.nextInt();
            stucj[i][1] = stucj[i][0];
            stucj[i][2] = i;
        }
        //对成绩排序 stucj[i][1]为成绩临时放地点 stucj[i][2]为排名
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (stucj[j][1] > stucj[j + 1][1]) {
                    int temp;
                    temp = stucj[j][1];
                    stucj[j][1] = stucj[j + 1][1];
                    stucj[j + 1][1] = temp;
                    temp = stucj[j][2];
                    stucj[j][2] = stucj[j + 1][2];
                    stucj[j + 1][2] = temp;
                }
            }
        }
        //输出答案
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stu[0].length; j++) {
                System.out.print(stu[stucj[i][2]][j] + " ");
            }
            System.out.println(stucj[stucj[i][2]][0]);
        }
    }
}
