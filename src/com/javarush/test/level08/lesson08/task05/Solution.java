package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("Иванов", "Петя");
        map.put("Сидоров", "Коля");
        map.put("Петров", "Ваня");
        map.put("Черезза", "Вова");
        map.put("Сидор", "Петя");
        map.put("Ива", "Коля");
        map.put("Петро", "Petro");
        map.put("Ивано", "Петя");
        map.put("Чере", "Петя");
        map.put("Си", "Вова");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> list=new ArrayList<String>();
        int i=0;
        for(Map.Entry<String,String> m1:map.entrySet()) list.add(i++,m1.getValue());
        for(int j=0;j<list.size();j++){
            for(int k=1;k<list.size();k++){
                if(list.get(j).equals(list.get(k)))
                    list.remove(k);
            }
        }
        for(int n=0;n<list.size();n++)
            removeItemFromMapByValue(map,list.get(n));
/*
        for(Map.Entry<String,String> m:map.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
        for(String s:list)System.out.println(s);
*/
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args){
        removeTheFirstNameDuplicates(createMap());
    }
}
