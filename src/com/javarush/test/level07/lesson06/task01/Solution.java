package com.javarush.test.level07.lesson06.task01;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> rows=new ArrayList<String>();
        rows.add("Test1");
        rows.add("Test2");
        rows.add("Test3");
        rows.add("Test4");
        rows.add("Test5");

        System.out.println(rows.size());

        for(String s:rows)System.out.println(s);
    }
}
