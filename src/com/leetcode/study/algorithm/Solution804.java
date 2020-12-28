package com.leetcode.study.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 * <p>
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 * <p>
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + ".-" + "-..." 字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * <p>
 * 返回我们可以获得所有词不同单词翻译的数量。
 * <p>
 * 例如:
 * 输入: words = ["gin", "zen", "gig", "msg"]
 * 输出: 2
 * 解释:
 * 各单词翻译如下:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * 共有 2 种不同翻译, "--...-." 和 "--...--.".
 *  
 * <p>
 * 注意:
 * <p>
 * 单词列表words 的长度不会超过 100。
 * 每个单词 words[i]的长度范围为 [1, 12]。
 * 每个单词 words[i]只包含小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-morse-code-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Program Name: leetcode-study
 * Created by yanlp on 2020-12-28
 *
 * @author yanlp
 * @version 1.0
 */
public class Solution804 {
    /**
     * 所有26个英文字母对应摩尔斯密码表
     */
    public static final String[] morseArray = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "." +
            "." +
            ".-",
            ".--", "-..-", "-.--", "--.."};


    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> resSet = new HashSet<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder sbr = new StringBuilder();
            for (char c : chars) {
                sbr.append(morseArray[c - 'a']);
            }
            resSet.add(sbr.toString());

        }
        System.out.println(resSet);
        return resSet.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
