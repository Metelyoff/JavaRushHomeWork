package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него. 
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
		Human mother=new Human("Tanya","Fastova",40,false);
		Human father=new Human("Yura","Metelyov",45,true);
		Human son=new Human("Denis","Metelyov",24,true,mother,father);
		System.out.println(son.toString());
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
		private String name;
		private String sername;
		private int age;
		private boolean sex;
		private Human mother;
		private Human father;
		
		Human(){
			this.name=null;
			this.sername=null;
			this.age=0;
			this.sex=false;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name){
			this.name=name;
			this.sername=null;
			this.age=0;
			this.sex=false;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name,String sername){
			this.name=name;
			this.sername=sername;
			this.age=0;
			this.sex=false;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name,String sername,int age){
			this.name=name;
			this.sername=sername;
			this.age=age;
			this.sex=false;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name,String sername,int age,boolean sex){
			this.name=name;
			this.sername=sername;
			this.age=age;
			this.sex=sex;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name,String sername,int age,boolean sex,Human mother,Human father){
			this.name=name;
			this.sername=sername;
			this.age=age;
			this.sex=sex;
			this.mother=mother;
			this.father=father;
		}
		
		Human(String name,Human mother,Human father){
			this.name=name;
			this.sername=null;
			this.age=0;
			this.sex=false;
			this.mother=mother;
			this.father=father;
		}
		
		Human(String name,String sername,Human mother,Human father){
			this.name=name;
			this.sername=sername;
			this.age=0;
			this.sex=false;
			this.mother=mother;
			this.father=father;
		}
		
		Human(String name,String sername,boolean sex){
			this.name=name;
			this.sername=sername;
			this.age=0;
			this.sex=sex;
			this.mother=null;
			this.father=null;
		}
		
		Human(String name,String sername,int age,Human mother,Human father){
			this.name=name;
			this.sername=sername;
			this.age=age;
			this.sex=false;
			this.mother=mother;
			this.father=father;
		}

		@Override
		public String toString()
		{
			// TODO: Implement this method
			String text = "";
            if(this.name!=null) text += "Имя: " + this.name+"\n";
			if(this.sername!=null)text += "Фамилия: "+this.sername+"\n";
            if(this.age>0)text += "возраст: " + this.age+"\n";
			text += "пол: " + (this.sex ? "мужской"+"\n": "женский"+"\n");
			if(this.mother!=null) text+="Мама "+this.mother+"\n";
            if(this.father!=null) text+="Папа "+this.father+"\n";
			return text;
		}
    }
}
