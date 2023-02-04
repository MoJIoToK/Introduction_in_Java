/*
 * Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
 */
package S5_CW;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tlist = new TreeMap<>();
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String [] strArr = str.split(" ");
        for (String el : strArr) {
            tlist.put(el, el.length());
        }
        System.out.println(tlist);

        

        
        
    }
    
}
