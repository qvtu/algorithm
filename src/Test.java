import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: kkoo
 * Date: 2021/11/11 9:28 下午
 * FileName: Test
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        输入上限数N
        int N=in.nextInt();
//        数素数对个数npd
        int npd = 0;
//        素数检验数p
        int p=0;
//        素数暂存数temp
        int temp=2;
        if(N>=3) {
            for (int i = 3; i <= N; i+=2) {
                for (int j = 2; j*j<=i; j++) {
                    if (i % j == 0) {
                        p++;
                    }
                }
                if (p == 0) {
                    System.out.println(i);
                    if(i-temp==2){
                        npd++;
                    }
                    temp=i;
                }
                p = 0;
            }
        }
        System.out.println(npd);
    }
}
