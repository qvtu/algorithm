package stock;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/12/21 0021 16:42
 * FileName: riseAndFall
 */
public class RiseAndFall {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String name = in.nextLine();
        int rd=Math.random()>0.5?1:0;
        if (rd==0){
            System.out.println(name+"明天跌，今天别买");
        }else if (rd==1){
            System.out.println(name+"明天涨，今天快买");
        }
    }
}
