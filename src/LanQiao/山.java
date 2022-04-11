package LanQiao;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/11 0011 11:05
 * @fileName: 山
 */
public class 山 {
    public static void main(String[] args) {
        //记录满足条件的个数
        int count = 0;
        for (int i = 2022; i <= 20222022; i++) {
            //int -> String
            String s = i + "";
            //String -> char[]
            char[] t = s.toCharArray();
            if (pdhws(t)) {
                if (pdsw(t)) {
                    System.out.println(t);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    /**
     * 判断是否是回文数
     *
     * @param t
     * @return
     */
    public static boolean pdhws(char[] t) {
        boolean flag = true;
        int mid = t.length / 2;
        for (int j = 0; j < mid; j++) {
            if (t[j] == t[t.length - j - 1]) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    /**
     * 是否是先单调不减，后单调不增
     *
     * @param t
     * @return
     */
    public static boolean pdsw(char[] t) {
        boolean flag = true;
        int mid = t.length / 2;
        for (int j = 0; j < mid; j++) {
            if (t[j] <= t[j + 1]) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
