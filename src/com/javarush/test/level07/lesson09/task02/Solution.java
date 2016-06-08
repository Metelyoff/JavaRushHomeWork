package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> rows=new ArrayList<String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<5;i++)rows.add(i,reader.readLine());

        rows.remove(2);

        for(int i=0;i<rows.size();i++){
            int n=rows.size()-i-1;
            System.out.println(rows.get(n));
        }
    }
}
