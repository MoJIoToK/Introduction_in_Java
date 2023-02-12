/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку: имя ноутбука и выбранный критерий. 
Критерии фильтрации можно хранить в Map.
Сделать выборку.
Например:
Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Пользователь ввел 1. Вывести в виде.
|Имя| ОЗУ|
|--------|-----------|
| Asus | 2ГБ |
| HP | 4ГБ |
| MSI | 6ГБ |
2. Отфильтровать ноутбуки первоначального множества. По имени ноутбука в алфавитном порядке, по цене по убыванию
Например, по алфавиту
|Имя| ОЗУ| Цена
|--------|-----------|-----------|
| Asus | 2ГБ | 4666|
| MSI | 4ГБ |6600|
| HP | 6ГБ| 5555|
 */

package S6_HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<notebooks> laptops = new HashSet<>();

        boolean flag = true;

        laptops.add(new notebooks("MSI", "Windows", "Black", 1, 10));
        laptops.add(new notebooks("Acer", "Linux", "White", 2, 20));
        laptops.add(new notebooks("Mac", "MacOs", "RGB", 1, 30));
        laptops.add(new notebooks("Kac", "MacOS", "Grey", 16, 97990));
        laptops.add(new notebooks("HP", "MacOS", "Blue", 32,4290));
        
        while (flag){
            System.out.println("\nВ продаже имеется " + laptops.size() + " моделей ноутбуков\n");
            System.out.println("Вы желаете сделать выборку по заданному критерию или отфильтровать ноутбуки? \n1 - Сделать выборку;\n" + 
            "2 - Отфильтровать; \n3 - Выход");
            String choice = iScanner.next();

            if (choice.equals("1")) {
                var criteria = getCriteria(laptops);
            }
            else if (choice.equals("2")) filter(laptops);
            else flag = false;
        }
    }

    public static HashMap<String, String> getCriteria(HashSet<notebooks> laptops) {
        
        HashMap<String,String> criterias = new HashMap<>();
        boolean flag = true;

        while (flag){
            
            System.out.println("Выберите необходимый критерий из нижеперечисленного: \n1 - Операционная система;\n" + 
            "2 - Оперативная память; \n3 - Цвет; \n4 - Цена; \n5 - Exit");
            String choice = iScanner.next();
            
            for (notebooks el : laptops) {
                if (choice.equals("1")) criterias.put(el.getModel(), el.getOs());
                else if (choice.equals("2")) criterias.put(el.getModel(), Float.toString(el.getMemory()));
                else if (choice.equals("3")) criterias.put(el.getModel(), el.getColor());
                else if (choice.equals("4")) criterias.put(el.getModel(), Float.toString(el.getPrice()));
                else if (choice.equals("5")) flag = false;
            }
        }
        
        System.out.println("| Имя | Критерий |");

        for (var item : criterias.entrySet()) {
            System.out.printf("| %s | %s |\n", item.getKey(), item.getValue());
        }
        return criterias;
    }

    public static void filter(HashSet<notebooks> laptops) {
        List<notebooks> laptops2 = new ArrayList<>(laptops);
        boolean flag = true;

        while (flag){
            
            System.out.println("\nВведите критерий фильтрации (1 - Название, 2 - Цена, 3 - Выход) : ");
            String choiceFilter = iScanner.next();
        
            if (choiceFilter.equals("1")) Collections.sort(laptops2, Comparator.comparing(notebooks::getModel));

            else if (choiceFilter.equals("2")) Collections.sort(laptops2, Comparator.comparing(notebooks::getPrice));
            else flag = false;

            System.out.println("| Имя | Операционная система | Объем оперативной памяти | Цена");

            for (notebooks l : laptops2){
                System.out.println(l.toString());
            }
        }         
    }
}
