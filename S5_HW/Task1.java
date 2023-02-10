/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
package S5_HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
            Map<String, ArrayList<String>> book = new HashMap<>();
            AddNumber("Ivanov", "1", book);
            AddNumber("Ivanov", "1-2", book);
            Print(book);
            
            AddNumber("Bagrov", "1", book);
            System.out.println();
            Print(book);

            AddNumber("Dorin", "1", book);
            System.out.println();
            Print(book);
        }


    public static void AddNumber(String key, String value, Map<String, ArrayList<String>> map){
        if (map.containsKey(key)) map.get(key).add(value);
        else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    
    public static void Print(Map<String, ArrayList<String>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(String el: item.getValue()) phones = phones + el + ", ";
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

}
