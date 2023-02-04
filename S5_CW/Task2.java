/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */


package S5_CW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Character, Character> stroka = new HashMap<>();
        Stack<Character> stac = new Stack<>();

        stroka.put('[', ']');
        stroka.put('(', ')');

        //System.out.print("Введите строку: ");
        String str = "[6+(3*3)]";
        //iScanner.nextLine();//name[0] - номер. name[1] - фамилия
        for (int i = 0; i < str.length(); i++) {    
            Character a = str.charAt(i);// символ первого слова
            if (stroka.containsKey(a)) 
            {
                stac.push(a);
            }
            System.out.println(stac);
            if (stroka.containsValue(a))
            {
                if (stac.isEmpty())
                {
                    System.out.println(false);
                    break;
                }
                if (!stroka.get(stac.pop()).equals(a))
                {
                    System.out.println(false);
                    break;
                }
            }    
        }
        if (stac.isEmpty()){
            System.out.println(true);
        }
        else System.out.println(false);
    }

    
}
