package per.menggi.web.datascript;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class KuaiShou2 {
    public static void main(String[] args) {
        int[] c = {8, 9, 7};
        int[] b = {5, 8, 3};
        int[] a = new KuaiShou2().GetPowerFactor(33, 3);
        for (int d : a) {
            System.out.println(d);
        }
    }

    public int[] GetPowerFactor(int R, int N) {
        // write code here
        int pow = 1, num = 0;
        while ((num = (int) Math.pow(N, pow)) < R) {
            pow++;
        }
        List<Integer> list = new ArrayList<>();
        int next = pow -1;
        while (R > 0 && pow >= 1) {
            num = (int) Math.pow(N, --pow);
            if (R >= num && next == pow) {
                R -= num;
                next = pow -1;
                list.add(pow);
            } else {
                return new int[0];
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
