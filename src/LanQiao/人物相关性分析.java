package LanQiao;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/7 0007 20:05
 * FileName: 人物相关性分析
 */
public class 人物相关性分析 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int k = Integer.parseInt(in.nextLine());
        String[] str = in.nextLine().split(" ");
        int count=0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Alice")||str[i].equals("Alice.")) {
                int j;
                int t = 0;
                for (j = i + 1; i < str.length - 2; j++) {
                    t+=1;
                    if (str[j].equals("Bob")||str[j].equals("Bob.")) {
                        t+=str[j].length();
                        if (t<=k){
                            count++;
                        }else {
                            break;
                        }
                        break;
                    } else {
                        t += str[j].length() + 1;
                    }
                }
            }else if (str[i].equals("Bob")||str[i].equals("Bob.")){
                int j;
                int t = 0;
                for (j = i + 1; i < str.length - 2; j++) {
                    t+=1;
                    if (str[j].equals("Alice")||str[j].equals("Alice.")) {
                        t+=str[j].length();
                        if (t<=k){
                            count++;
                        }else {
                            break;
                        }
                        break;
                    } else {
                        t += str[j].length() + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
