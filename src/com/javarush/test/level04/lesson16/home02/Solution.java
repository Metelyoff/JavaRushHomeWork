package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{

    public int getAverageNumsOf(int a,int b,int c){
        int result=0;
        if(a>b&&a<c||a<b&&a>c)
            result=a;
        else if(b<c&&b>a||b<a&&b>c)
            result=b;
        else if(c<b&&c>a||c>b&&c<a)
            result=c;
        return result;
    }

    public static void main(String[] args)   throws Exception
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
        System.out.print(solution.getAverageNumsOf(num1,num2,num3));
    }
}
