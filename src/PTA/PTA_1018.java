package PTA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/1 0001 9:03
 * FileName: PTA_1018
 */
public class PTA_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //输入n
        int n = Integer.parseInt(bf.readLine());
        int wa[] = new int[3];
        int wb[] = new int[3];
        int pj = 0;
        for (int i = 0; i < n; i++) {
            String[] s = bf.readLine().split(" ");
            String a = s[0];
            String b = s[1];
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