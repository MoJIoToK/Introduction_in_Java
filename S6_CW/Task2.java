/*
 * . Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и 
верните его в виде числа с плавающей запятой. 
Для вычисления процента используйте формулу: 
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве. 

 */

package S6_CW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {
        Integer [] arr = fillArray(1000);

        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Iterator<Integer> iterator = set1.iterator();
        while(iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println();
        Unique(arr.length, set1.size());

    }

    public static void Unique(int lenght, int size) {
        float result = (float) size * 100 / lenght;
        System.out.println(result);
    }

    public static Integer[] fillArray(int size) {
        Integer[] newArr = new Integer[size];
        Random random = new Random();
        for (Integer i = 0; i < size; i++) {
            newArr[i] = random.nextInt(25);
        }
        return newArr;
    }

    
}
