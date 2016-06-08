package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String exitSum="сумма";
        boolean exit=true;
        int result=0;
        while(exit){
            String sNums=reader.readLine();
            if(exitSum.equals(sNums)){
                exit=false;
            }else{
                int nums = Integer.parseInt(sNums);
                result += nums;
            }
        }
        System.out.println(result);
    }
}
