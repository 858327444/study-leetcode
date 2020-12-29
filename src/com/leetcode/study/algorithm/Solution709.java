package com.leetcode.study.algorithm;

/**
 * 709. 转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 * <p>
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 * <p>
 * 输入: "LOVELY"
 * 输出: "lovely"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Program Name: leetcode-study
 * Created by yanlp on 2020-12-28
 *
 * @author yanlp
 * @version 1.0
 */
public class Solution709 {
    private static String toLowerCase(String str) {
        if (null == str || "".equals(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char aChar : str.toCharArray()) {
            if (aChar >= 'A' && aChar <= 'Z') {
                sb.append((char) (aChar + 32));
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("HeLlO"));
    }
}
