package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human firstGrandfather=new Human("Ivan",true,67,null,null);
        Human secondGrandfather=new Human("Pietro",true,88,null,null);
        Human firstGrandmother=new Human("Masha",false,64,null,null);
        Human secondGrandmother=new Human("Nura",false,67,null,null);
        Human father=new Human("Jon",true,30,firstGrandfather,firstGrandmother);
        Human mother=new Human("Julia",false,27,secondGrandfather,secondGrandmother);
        Human son1=new Human("Jim",true,4,father,mother);
        Human son2=new Human("Jon",true,4,father,mother);
        Human doughter=new Human("Larisa",false,2,father,mother);

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
        private Human father;
        private Human mother;

        public Human(String name,boolean sex,int age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
