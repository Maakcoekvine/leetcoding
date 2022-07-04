package com.coek;

/**
 * @author MaakCoekVine
 * @create 2022-05-25 14:19
 *
 *  找出一个数组中出现次数为奇数的数
 */
public class OddNumber {

    public int getOddNum(int[] array){
        int num=0;

        // 0跟任何数异或都等于另一个数，相等两个数异或结果为0
        for (int i=0;i<array.length;i++){
            num=num^array[i];
        }

        return num;

    }

}