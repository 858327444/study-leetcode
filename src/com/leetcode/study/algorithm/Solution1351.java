package com.leetcode.study.algorithm;

/**
 * 1351. 统计有序矩阵中的负数
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 
 * <p>
 * 请你统计并返回 grid 中 负数 的数目。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * 输出：8
 * 解释：矩阵中共有 8 个负数。
 * 示例 2：
 * <p>
 * 输入：grid = [[3,2],[1,0]]
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：grid = [[1,-1],[-1,-1]]
 * 输出：3
 * 示例 4：
 * <p>
 * 输入：grid = [[-1]]
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 100
 * -100 <= grid[i][j] <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Program Name: leetcode-study
 * Created by yanlp on 2020-12-28
 *
 * @author yanlp
 * @version 1.0
 */
public class Solution1351 {

    public static int countNegatives1(int[][] grid) {
        int count = 0;
        for (int[] outIntArr : grid) {
            for (int innerInt : outIntArr) {
                if (innerInt < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 方法二：二分查找
     * 注意到题目中给了一个性质，即矩阵中的元素无论是按行还是按列，都以非递增顺序排列，此处的非递增并不代表有乱序....可以考虑把这个性质利用起来优化暴力。
     * 已知这个性质告诉了我们每一行的数都是有序的，所以我们通过二分查找可以找到每一行中从前往后的第一个负数，那么这个位置之后到这一行的末尾里所有的数必然是负数了，可以直接统计。
     *
     * @param grid
     * @return
     */
    private static int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        //按行来遍历
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = right - (right - left) / 2;
                if (grid[i][mid] < 0) {
                    if (mid == 0) {
                        count += n;
                        break;
                    }
                    if (grid[i][mid - 1] >= 0) {
                        count += n - mid;
                        break;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] a = {{1, -3, 2, 0, -8}, {-10, -3, -2, -9, -7}};

        System.out.println(countNegatives(a));

    }
}
