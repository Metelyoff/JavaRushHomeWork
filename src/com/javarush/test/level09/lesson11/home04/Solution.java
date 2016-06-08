package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String enterDate=reader.readLine();
        Date date=new Date(enterDate);
        SimpleDateFormat month=new SimpleDateFormat("MMM",Locale.ENGLISH);
        String formattedMonth=month.format(date).toUpperCase();
        SimpleDateFormat dayOfMonth=new SimpleDateFormat("dd");
        String formattedDayOfMonth=dayOfMonth.format(date);
        SimpleDateFormat year=new SimpleDateFormat("yyyy");
        String formattedYear=year.format(date);
        System.out.println(formattedMonth+" "+formattedDayOfMonth+", "+formattedYear);
    }
}
