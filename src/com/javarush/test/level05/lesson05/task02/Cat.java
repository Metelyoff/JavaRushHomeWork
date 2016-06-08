package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        int anotherStrngth=((Cat)anotherCat).getStrength();
        if(anotherCat instanceof Cat){
            if(this.age>5&&this.age<20&&this.age>((Cat)anotherCat).getAge()){
                this.strength+=1;
            }
            if(((Cat)anotherCat).getAge()>5&&((Cat)anotherCat).getAge()<20&&((Cat)anotherCat).getAge()>this.age){
                anotherStrngth+=1;
                ((Cat)anotherCat).setStrength(anotherStrngth);
            }
            if(this.weight>((Cat)anotherCat).getWeight()){
                this.strength+=1;
            }
            if(((Cat)anotherCat).getWeight()>this.weight){
                anotherStrngth+=1;
                ((Cat)anotherCat).setStrength(anotherStrngth);
            }
            if(((Cat)anotherCat).getStrength()<this.strength){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
