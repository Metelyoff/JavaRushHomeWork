package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> enterNums=new ArrayList<Integer>();
        ArrayList<Integer> nums3=new ArrayList<Integer>();
        ArrayList<Integer> nums2=new ArrayList<Integer>();
        ArrayList<Integer> otherNums=new ArrayList<Integer>();

        for(int i=0;i<20;i++)enterNums.add(i,Integer.parseInt(reader.readLine()));

        for(int i=0;i<enterNums.size();i++){
            Integer n=enterNums.get(i);
            if(n%3==0) {nums3.add(n);}
            if(n%2==0) {nums2.add(n);}
            if(n%3!=0&&n%2!=0) {otherNums.add(n);}
        }
        printList(nums3);
        printList(nums2);
        printList(otherNums);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for(Integer i:list)System.out.println(i);
    }
}
