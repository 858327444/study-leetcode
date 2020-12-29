package com.leetcode.study.algorithm;

/**
 * 1323. 6 和 9 组成的最大数字
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * <p>
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * <p>
 * 请返回你可以得到的最大数字。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：num = 9669
 * 输出：9969
 * 解释：
 * 改变第一位数字可以得到 6669 。
 * 改变第二位数字可以得到 9969 。
 * 改变第三位数字可以得到 9699 。
 * 改变第四位数字可以得到 9666 。
 * 其中最大的数字是 9969 。
 * 示例 2：
 * <p>
 * 输入：num = 9996
 * 输出：9999
 * 解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。
 * 示例 3：
 * <p>
 * 输入：num = 9999
 * 输出：9999
 * 解释：无需改变就已经是最大的数字了。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-69-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Program Name: leetcode-study
 * Created by yanlp on 2020-12-28
 *
 * @author yanlp
 * @version 1.0
 */
public class Solution1323 {

    private static int maximum69Number(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '6' && !flag) {
                sb.append('9');
                flag = true;
                continue;
            }
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
