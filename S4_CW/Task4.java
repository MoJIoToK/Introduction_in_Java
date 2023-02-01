/*
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

package S4_CW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        fillArray(list);
        System.out.println("Список " + list);
        Stack<Integer> stac = new Stack<>();
        stac.addAll(list);
        System.out.println("Стэк " + stac);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(list);
        while (!stac.isEmpty())
        {
            System.out.print(stac.pop() + " ");
        }
        System.out.println();
        while (!queue.isEmpty())
        {
            System.out.print(queue.remove() + " ");
        }    
    }

    public static ArrayList<Integer> fillArray(ArrayList<Integer> list) {
        Random random = new Random();
        for (int index = 0; index < 15; index++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    
}
