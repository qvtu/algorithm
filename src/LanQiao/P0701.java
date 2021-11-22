package LanQiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/21 5:33 下午
 * FileName: P0701
 */
public class P0701 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        char[] str = in.nextLine().toCharArray();
        if ((str[str.length - 1] == 's') || (str[str.length - 1] == 'x') || (str[str.length - 1] == 'z') || (str[str.length - 2] == 'c' && str[str.length - 1] == 'h') || (str[str.length - 2] == 's' && str[str.length - 1] == 'h')) {
            for (char t : str) {
                System.out.print(t);
            }
            System.out.print("es");
        } else if (str[str.length - 1] == 'y' && (str[str.length - 2] != 'a' && str[str.length - 2] != 'e') && str[str.length - 2] != 'i' && str[str.length - 2] != 'o' && str[str.length - 2] != 'u') {
            for (int i = 0; i < str.length - 1; i++) {
                System.out.print(str[i]);
            }
            System.out.print("ies");
        } else {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.print("s");
        }
    }
}
