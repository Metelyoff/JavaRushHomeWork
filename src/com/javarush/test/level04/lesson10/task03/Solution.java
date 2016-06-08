package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{

    public void copyRowOf(String row, int num){
        while(num!=0)
        {
            System.out.println(row);
            num--;
        }
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        String sNum=reader.readLine();
        int num=Integer.parseInt(sNum);
        Solution solution=new Solution();
        solution.copyRowOf(s,num);
    }
}
