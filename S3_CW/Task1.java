/*
 * Заполнить список десятью случайными числами. 
 * Отсортировать список методом sort() и вывести его на экран.
 */

package S3_CW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    
        fillArray(list);
        printArr(list); 
        }
    
    public static void fillArray(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            list.add(rand);
        }
    }

    public static void printArr(List<Integer> list) {
        list.sort(null);
        for (var el : list) {
            System.out.print(el + " ");            
        }
        System.out.println(); 
    }

}
