package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[][] sArray=new String[10][10];
        int i=0;
        while(i<sArray.length){
            int j=0;
            while (j<sArray[i].length){
                sArray[i][j]="S";
                System.out.print(sArray[i][j]);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
