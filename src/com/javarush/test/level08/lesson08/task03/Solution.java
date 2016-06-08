package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map= new HashMap<>();
        map.put("Иванов", "Петя");
        map.put("Сидоров", "Коля");
        map.put("Петров", "Ваня");
        map.put("Череззаборногузадерищенский", "Вова");
        map.put("Сидор", "Петя");
        map.put("Ива", "Коля");
        map.put("Петро", "Петя");
        map.put("Ивано", "Петя");
        map.put("Чере", "Петя");
        map.put("Си", "Вова");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int countNames=0;
        for(Map.Entry<String,String> m:map.entrySet())
            if(m.getValue().equals(name))countNames+=1;
        return countNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int countLastNames=0;
        for(Map.Entry<String,String> m:map.entrySet())
            if(m.getKey().equals(familiya))countLastNames+=1;
        return countLastNames;
    }
    public static void main(String[] args){
        System.out.println(getCountTheSameFirstName(createMap(),"Петя"));
        System.out.println(getCountTheSameLastName(createMap(),"Иванов"));
    }
}
