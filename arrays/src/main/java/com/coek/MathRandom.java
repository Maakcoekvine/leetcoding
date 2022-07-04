package com.coek;

/**
 * @author MaakCoekVine
 * @create 2022-05-25 14:04
 *
 *  给定一个f()函数 只能返回1~5的数，
 *      求1~7等概率出现
 */
public class MathRandom {


    // 随机返回1~5的f函数
    private int f(){
        return ((int)(Math.random()*5))+1;
    }


    // 等概率返回0 和 1
    private int f1(){
        int val=0;
        do{
            val=f();
        }while(val==3);

        return val >3?1:0;
    }


    // 0和1组成三位二进制数，等概率返回0~7
    private int f2(){
        return (f1()<<2)+(f1()<<1)+(f1()<<0);
    }

    // 等概率返回1 ~ 7
    public int f3(){
        int val=-1;
        do{
            val=f2();
        }while(val==0);

        return val;
    }
}