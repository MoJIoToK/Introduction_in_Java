
/*
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 *  Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
 * Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
 * Распечатайте содержимое данного множества.

 */
package S6_CW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {
        // Integer[] arr = {1, 2, 3, 4, 2, 4, 7, 5, 6, 3};

        // HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        // set1.add(10);
        // set1.remove(5);
        // Iterator<Integer> iterator = set1.iterator();
        // while(iterator.hasNext()) System.out.print(iterator.next() + " ");

        // System.out.println();

        // LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        // Iterator<Integer> iterator2 = set2.iterator();
        // while(iterator2.hasNext()) System.out.print(iterator2.next() + " ");

        // System.out.println();

        // TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        // Iterator<Integer> iterator3 = set3.iterator();
        // while(iterator3.hasNext()) System.out.print(iterator3.next() + " ");

        class_cat Barsik = new class_cat();
        Barsik.name = "Barsik";
        Barsik.Print();
        class_cat Pushok = new class_cat("Barsik", "Black");
        Pushok.Print();
        System.out.println(Barsik.equals(Pushok));

    }
    
}
