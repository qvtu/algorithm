package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/11 0011 17:13
 * @fileName: 字符统计
 */
public class 字符统计 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        // A-65
        int[] index = new int[27];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            index[(int) arr[i] - 65]++;
            if (max < index[(int) arr[i] - 65]) {
                max = index[(int) arr[i] - 65];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (index[i] == max) {
                System.out.print((char) (i + 65));
            }
        }
    }
}
