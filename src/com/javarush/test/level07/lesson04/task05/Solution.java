package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] bigArray=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<bigArray.length;i++)
        {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        int[] littleArray1= Arrays.copyOfRange(bigArray,0,10);
        int[] littleArray2=Arrays.copyOfRange(bigArray,10,20);

        for(int n:littleArray2)System.out.println(n);
    }
}
