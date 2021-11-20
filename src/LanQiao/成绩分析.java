package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 成绩分析 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入n
        int n = in.nextInt();
        //存储得分
        int[] arr = new int[n];
        //输入得分
        //保存最高分 最低分 总分 平均分
        int max = -1;
        int min = 0x3f3f3f;
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            //输入得分
            arr[i] = in.nextInt();
            //判断最高分 最低分
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f", sum / n);
    }
}
