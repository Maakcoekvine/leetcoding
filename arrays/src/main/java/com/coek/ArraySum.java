package com.coek;

/**
 * @author MaakCoekVine
 * @create 2022-05-25 14:27
 *
 *  假设给定一个数组 [3,5,2,4]
 *            再分别给出左右两个下标，求从左下标到右下标之间的所有值的和
 *            假设：left= 0,返回3; left=0,right=1,返回8;  left=1,right=2,返回7
 */
public class ArraySum {


    // 先将数组中逐一相加，将相加结果放入新数组
    public int getSum(int[] array,int left,int right){

        int len=array.length;
        if (left>right||right>len-1){
            // 左边界大于右边界 , 数组越界
            return -1;
        }
        int[] help=new int[len];
        help[0]=array[0];

        for (int i = 1; i < len; i++) {
            //  相加数据放入新数组
            help[i]=help[i-1]+array[i];
        }

        return left == 0?help[right]:help[right]-help[left-1];

    }
}