package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.nio.Buffer;

public class Solution
{

    public void sortThreeNumber(int a,int b,int c){
        int[] nums={a,b,c};
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sNum1=reader.readLine();
        String sNum2=reader.readLine();
        String sNum3=reader.readLine();
        int num1=Integer.parseInt(sNum1);
        int num2=Integer.parseInt(sNum2);
        int num3=Integer.parseInt(sNum3);
        Solution solution=new Solution();
        solution.sortThreeNumber(num1,num2,num3);
    }
}
