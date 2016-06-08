package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException{
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String enterMonth=reader.readLine();
        Map<String,Integer> calendar=new HashMap<String, Integer>();
        calendar.put("JANUARY",1);
        calendar.put("FEBRUARY",2);
        calendar.put("MARCH",3);
        calendar.put("April",4);
        calendar.put("MAY",5);
        calendar.put("JUNE",6);
        calendar.put("JULY",7);
        calendar.put("AUGUST",8);
        calendar.put("SEPTEMBER",9);
        calendar.put("OCTOBER",10);
        calendar.put("NOVEMBER",11);
        calendar.put("DECEMBER",12);
        for(Map.Entry<String,Integer> c:calendar.entrySet()){
            if(enterMonth.toUpperCase().equals(c.getKey()))
                System.out.println(enterMonth+" is "+c.getValue()+" month");
        }
    }
}
