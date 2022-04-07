package LanQiao;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/7 3:01 PM
 * @fileName: 方格染色
 */
public class 方格染色 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < k; i++) {
            int o = in.nextInt();
            int p = in.nextInt();
            int c = in.nextInt();
            arr[o][p] = c+1;
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
