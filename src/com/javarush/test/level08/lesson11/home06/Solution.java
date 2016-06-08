package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human son1=new Human("Jim",true,4);
        Human son2=new Human("Jon",true,4);
        Human doughter=new Human("Larisa",false,2);
        Human father=new Human("Jon",true,30,son1,son2,doughter);
        Human mother=new Human("Julia",false,27,son1,son2,doughter);
        Human firstGrandfather=new Human("Ivan",true,67,father);
        Human firstGrandmother=new Human("Masha",false,64,father);
        Human secondGrandfather=new Human("Pietro",true,88,mother);
        Human secondGrandmother=new Human("Nura",false,67,mother);

        System.out.println(firstGrandfather);
        System.out.println(secondGrandfather);
        System.out.println(firstGrandmother);
        System.out.println(secondGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doughter);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children=new ArrayList<Human>();

        public Human(String name,boolean sex,int age,Human... children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children.addAll(Arrays.asList(children));
        }

        public String toString(){
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if(childCount > 0){
                text += ", дети: "+this.children.get(0).name;
                for (int i = 1; i < childCount; i++){
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }
}
