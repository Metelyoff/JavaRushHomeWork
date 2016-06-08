package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{

    public void drawTable(int m,int n){
        int[][] table=new int[m][n];
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                table[i][j]=8;
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sNum1=reader.readLine();
        String sNum2=reader.readLine();
        int num1=Integer.parseInt(sNum1);
        int num2=Integer.parseInt(sNum2);
        Solution solution=new Solution();
        solution.drawTable(num1,num2);
    }
}
