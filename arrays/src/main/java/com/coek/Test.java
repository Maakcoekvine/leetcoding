package com.coek;

/**
 * @author MaakCoekVine
 * @create 2022-05-25 14:12
 */
public class Test {
    public static void main(String[] args) {
        MathRandom mathRandom = new MathRandom();
//        System.out.println(mathRandom.f3());

        double testTime=100000;
        double count=0;
        for (int i=0;i<testTime;i++){
            if (mathRandom.f3()==5){
                count++;
            }
        }
        System.out.println(count/testTime);


        System.out.println("======================");

        OddNumber oddNumber = new OddNumber();
        int[] array=new int[]{1,1,1,2,1,2,2,3,3};
        int num = oddNumber.getOddNum(array);
        System.out.println(num);


        System.out.println("===========================");

        ArraySum arraySum = new ArraySum();
        int[]array1=new int[]{3,5,2,4};
        System.out.println(arraySum.getSum(array1, 1, 3));
    }

}