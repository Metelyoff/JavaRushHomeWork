package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{

    public int maximumOfFourNums(int a,int b,int c,int d){
        int result=0;
        if(a>b&&a>c&&a>d)
            result=a;
        else if(b>a&&b>c&&b>d)
            result=b;
        else if(c>a&&c>b&&c>d)
            result=c;
        else if(d>a&&d>b&&d>c)
            result=d;
        return result;
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sNum1=reader.readLine();
        String sNum2=reader.readLine();
        String sNum3=reader.readLine();
        String sNum4=reader.readLine();
        int num1=Integer.parseInt(sNum1);
        int num2=Integer.parseInt(sNum2);
        int num3=Integer.parseInt(sNum3);
        int num4=Integer.parseInt(sNum4);
        Solution solution=new Solution();
        System.out.println(solution.maximumOfFourNums(num1, num2, num3, num4));
    }
}
