/*
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа. 
 * Пройти по списку, найти и удалить целые числа.
 * 
 * Вторая задача:
 * Каталог товаров книжного магазина сохранен в виде двумерного списка 
 * List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится 
 * название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения 
 * данной структуры.
 */

package S3_CW;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task3 {

    public static void main(String[] args) {
    ArrayList<String> FirstList = new ArrayList<>();
        FirstList.add("a");
        FirstList.add("b");
        FirstList.add("3");
        FirstList.add("d");
        FirstList.add("e");
        FirstList.add("5");
        FirstList.add("6");
        //Iterator newIter = FirstList.iterator();
        System.out.println(FirstList);
        ArrayList<String> SecondList = new ArrayList<>();
        for (String item: FirstList) {
            try {
                Integer.parseInt(item);
            }
            catch(Exception e){
//                System.out.println(e.getMessage());
                SecondList.add(item);
            }
        }
        System.out.println(FirstList);
        System.out.println(SecondList);
    
    }
}