package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int left=0;
    private int top=0;
    private int width=0;
    private int height=0;
    Rectangle rectangle;

    public void initialize(int left, int top, int width, int height){
        this.left=left;
        this.top=top;
        this.height=height;
        this.width=width;
    }

    public void initialize(int left, int top){
        this.left=left;
        this.top=top;
    }

    public void initialize(int left, int top, int width){
        this.left=left;
        this.top=top;
        this.height=width;
        this.width=width;
    }

    public void initialize(Rectangle rectangle){
        this.rectangle=rectangle;
    }

    public void initialize(Rectangle rectangle, int left, int top, int width, int height){
        this.rectangle=rectangle;
        this.left=left;
        this.top=top;
        this.height=height;
        this.width=width;
    }

    public void initialize(Rectangle rectangle, int left, int top, int width){
        this.rectangle=rectangle;
        this.left=left;
        this.top=top;
        this.height=width;
        this.width=width;
    }

    public void initialize(Rectangle rectangle, int left, int top){
        this.rectangle=rectangle;
        this.left=left;
        this.top=top;
    }
}
