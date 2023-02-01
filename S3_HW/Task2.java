/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

package S3_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        FillArray(list);
        System.out.println("Исходный список: ");
        PrintArray(list);

        ArrayList<Integer> sortlist = new ArrayList<>();

        for (Integer item: list)
        {
            if (item % 2 != 0)
            {
                sortlist.add(item);
            }
        }
        System.out.println("Список без целых чисел");
        PrintArray(sortlist);
    }
    
    public static void FillArray(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
    }
    
    public static void PrintArray(List<Integer> list) {
        for (var el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
