package leetcode;

import java.util.*;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne66 solution = new PlusOne66();
        int[] digits = {1,2,3};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
