package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

/*
 1. Создай список строк. 
 2. Добавь в него 5 строчек с клавиатуры. 
 3. Удали последнюю строку
 и вставь её в начало. 
 Повторить 13 раз. 
 4. Используя цикл, 
 выведи содержимое на экран, 
 каждое значение с новой строки.
*/

public class SolutionRemoveLast
{
	public static void main(String[] args) throws IOException{
		ArrayList<String> rows=new ArrayList<String>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++){
			String s=reader.readLine();
			rows.add(i,s);
		}
		for(int i=0;i<13;i++){
			int lastIndex=rows.size()-1;
			String lastRow=rows.get(lastIndex);
			String temp=lastRow;
			rows.remove(lastIndex);
			rows.add(0,temp);
		}
		for(String s:rows)System.out.println(s);
	}
}
