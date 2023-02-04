/*
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */
package S5_CW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // Map<Integer, String> names = new HashMap<>();
        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Введите номер и фамилию: ");
        //     String[] name = iScanner.nextLine().split(" ");//name[0] - номер. name[1] - фамилия
        //     names.put(Integer.parseInt(name[0]), name[1]);
        // }

        // for (var el : names.entrySet()) {
        //     if (el.getValue().equals("Ivanov"))
        //         System.out.print(el.getKey()+ ": "+ el.getValue() + "\n");
        // }
        // iScanner.close();
        System.out.println(IsIzomorph());
    }

    //Second seminar
    public static Boolean IsIzomorph() {
        Map<Character, Character> pairs = new HashMap<>();
        String s1 = "paperp";
        String s2 = "titlet";
        // s = "paper", t - "title"
        // key -> value
        // p -> t
        // a -> i
        // e -> l
        // r -> e
        
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        for (int i = 0; i < s1.length(); i++) {
            Character a = s1.charAt(i);// символ первого слова
            Character b = s2.charAt(i);// символ второго слова
            //если в map уже есть ключ "а", то тогда значение по ключу а должно соответствовать "b"
            if (pairs.containsKey(a) && pairs.get(a) != b)
                return false;
            
            else 
                pairs.put(a, b);    
        }
        return true;
    }

    
}
