package com.javarush.test.level08.lesson08.task04;

//import javax.swing.*;
import java.security.KeyStore;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        //напишите тут ваш код
        map.put("Иванов", new Date("JULY 1 1988"));
        map.put("Сидоров", new Date("JANUARY 2 1989"));
        map.put("Петров", new Date("FEBRUARY 5 1990"));
        map.put("Сидор", new Date("MARCH 7 1999"));
        map.put("Ива", new Date("APRIL 8 1977"));
        map.put("Петро", new Date("MAY 1 1935"));
        map.put("Ивано", new Date("JUNE 5 1963"));
        map.put("Чере", new Date("JUNE 3 1984"));
        map.put("Си", new Date("JUNE 11 1933"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Date> item = it.next();
            if(item.getValue().getMonth() > 4 && item.getValue().getMonth() < 8)
                it.remove();
        }
    }
    public static void main(String[] args){
        removeAllSummerPeople(createMap());
    }
}
