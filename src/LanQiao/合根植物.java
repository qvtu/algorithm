package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/7 0007 9:42
 * @fileName: 合根植物
 */
public class 合根植物 {
    static int[] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int m = in.nextInt();
        int n = in.nextInt();
        arr = new int[m * n + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (find(a) != find(b)) {
                hb(a, b);
            }
            hb(a, b);
        }
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == i) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static int find(int a) {
        if (a != arr[a]) {
            arr[a] = find(arr[a]);
            return arr[a];
        } else {
            return a;
        }
    }

    public static void hb(int a, int b) {
        arr[find(a)] = find(b);
    }
}
