package PTA;

import java.io.*;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/1 0001 9:03
 * FileName: PTA_1018
 */
public class PTA_1018 {
    public static void main(String[] args) throws IOException {
        //用BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //是过不了最后一个点的
        //参考了其他人用了
        // StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        //才过了最后一个点
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        //输入n
        in.nextToken();
        int n = (int)in.nval;
        //用wa wb 保存每一个手势的获胜次数 pj 保存平局次数
        int wa[] = new int[3];
        int wb[] = new int[3];
        int pj = 0;
        //判断谁获胜并且存储获胜手势
        for (int i = 0; i < n; i++) {
            in.nextToken();
            String a = in.sval;
            in.nextToken();
            String b = in.sval;
            if (a.equals(b)) {
                pj += 1;
            } else if (a.equals("C")) {
                if (b.equals("J")) {
                    wa[0]++;
                } else {
                    wb[2]++;
                }
            } else if (a.equals("J")) {
                if (b.equals("C")) {
                    wb[0]++;
                } else {
                    wa[1]++;
                }
            } else if (a.equals("B")) {
                if (b.equals("C")) {
                    wa[2]++;
                } else {
                    wb[1]++;
                }
            }
        }
        int wina = wa[0] + wa[1] + wa[2];
        int winb = n - wina - pj;
        out.println(wina + " " + pj + " " + winb);
        out.println(winb + " " + pj + " " + wina);
        //我还以为概率要怎么算原来只要看哪一个手势获胜次数最多
        out.print(gl(wa[0], wa[1], wa[2]) + " " + gl(wb[0], wb[1], wb[2]));
        out.flush();
    }

    public static char gl(int c, int j, int b) {
        if (b >= c && b >= j) {
            return 'B';
        }
        if (c > b && c >= j) {
            return 'C';
        }
        return 'J';
    }
}