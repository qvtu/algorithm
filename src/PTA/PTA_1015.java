package PTA;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/20 12:42 下午
 * FileName: PTA_1015
 */
public class PTA_1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入 考生总数 最低分数线 优先录取线
        int n = in.nextInt();
        int l = in.nextInt();
        int h = in.nextInt();
        //输入学生信息
        int[][] stu = new int[n][5];
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            //输入编号 德分 才分 总分
            stu[i][0] = in.nextInt();
            stu[i][1] = in.nextInt();
            stu[i][2] = in.nextInt();
            stu[i][3] = stu[i][1] + stu[i][2];
            if (stu[i][1] >= l && stu[i][2] >= l) {
                if (stu[i][1] >= h && stu[i][2] >= h) {
                    //如果才德全尽 标记为1
                    stu[i][4] = 1;
                } else if (stu[i][1] >= h && stu[i][2] < h) {
                    //德胜才
                    stu[i][4] = 2;
                } else if (stu[i][1] > stu[i][2]) {
                    //才德兼亡 但尚有 德胜才
                    stu[i][4] = 3;

                } else {
                    stu[i][4] = 4;
                }
                count++;
            }
        }
        System.out.println(count);
        for (int [] t :stu){
            System.out.println(t[0]+" "+t[1]+" "+t[2]);
        }
    }
}
