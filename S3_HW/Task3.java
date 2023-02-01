/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее ариф из этого списка.
 */

package S3_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        FillArray(list);
        System.out.println("Исходный список: ");
        PrintArray(list);

        list.sort(null);
        System.out.println("Минимальный элемент списка: " + list.get(0));
        System.out.println("Максимальный элемент списка: " + list.get(list.size() - 1));
        Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println("Среднее значение элементов списка: " + average);
        MaxMinAverage(list);
    }
    
    public static void FillArray(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int rand = random.nextInt(10);
            list.add(rand);
        }
    }

    public static void MaxMinAverage(List<Integer> list) {
        int max = list.get(0);
        int min = list.get(0);
        float sum = 0;
        float average;

        for (Integer item : list) {
            if (max < item) max = item;
            if (min > item) min = item;
            sum += item;
        }
        average = sum / list.size();
        System.out.println();
        System.out.println("Минимальный элемент списка с помощью цикла: " + min);
        System.out.println("Максимальный элемент списка с помощью цикла: " + max);
        System.out.println("Среднее значение элементов списка с помощью цикла: " + average);        
    }

    public static void PrintArray(List<Integer> list) {
        for (var el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
