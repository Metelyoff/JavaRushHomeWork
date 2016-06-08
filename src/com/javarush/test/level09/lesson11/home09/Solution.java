package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String,Cat> map=new HashMap<String,Cat>();
        map.put("b",new Cat("Barsik"));
        map.put("t",new Cat("Tuzik"));
        map.put("l",new Cat("Lola"));
        map.put("c",new Cat("Cat"));
        map.put("a",new Cat("Black"));
        map.put("o",new Cat("Ball"));
        map.put("ch",new Cat("Chappe"));
        map.put("w",new Cat("White"));
        map.put("y",new Cat("Yellow"));
        map.put("g",new Cat("Green"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> setCat=new HashSet<Cat>();
        for(Map.Entry<String,Cat> m:map.entrySet())
            setCat.add(m.getValue());
        return setCat;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
