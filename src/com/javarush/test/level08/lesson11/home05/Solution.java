package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код
        /*
        char[] words=new char[s.length()];
        for(int i=0;i<words.length;i++)words[i]=s.charAt(i);
        for(int i=0;i<words.length;i++){
            int previos=i-1;
            int next=i+1;
            if(previos>0){
                if(words[previos]==' '&&words[next]==' '||words[previos]==' '&&words[next]!=' '){
                    words[i]=s.toUpperCase().charAt(i);
                }
            }else{
                words[0]=s.toUpperCase().charAt(i);
            }
            System.out.print(words[i]);
        }
        */
        String[] result = s.split("\\s");
        for (int x=0; x<result.length; x++){
            System.out.println(firstUpperCase(result[x]));
        }
    }

    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
