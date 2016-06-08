package com.javarush.test.level07.lesson09.task03;

//import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> words=new ArrayList<String>();
        words.add("мама");
        words.add("мыла");
        words.add("раму");
        String insert="именно";
        for(int i=0;i<words.size();i++){
            if(!words.get(i).equals(insert))words.add(i+1,"именно");
        }
        for(String out:words)System.out.println(out);
    }
}
