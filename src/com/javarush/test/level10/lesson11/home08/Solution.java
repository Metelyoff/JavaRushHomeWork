package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
		ArrayList<String>[] arrayList=new ArrayList[3];
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<String> list3=new ArrayList<String>();
		list1.add("Test1 list1");
		list1.add("Test2 list1");
		list1.add("Test3 list1");
		list2.add("Test1 list2");
		list2.add("Test2 list2");
		list3.add("Test1 list3");
		list3.add("Test2 list3");
		arrayList[0]=list1;
		arrayList[1]=list2;
		arrayList[2]=list3;
        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}
