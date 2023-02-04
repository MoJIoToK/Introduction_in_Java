import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает 
 * элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        FillArray(list);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(list);
        System.out.println("Исходная очередь: ");
        System.out.println(queue);

        System.out.println();
        int a = 5;
        Enqueue(queue, a);
        System.out.println("Очередь после функции enqueue: ");
        System.out.println(queue);

        System.out.println();
        Dequeue(queue);
        System.out.println("Очередь после функции dequeue: ");
        System.out.println(queue);

        System.out.println();
        First(queue);
        System.out.println("Очередь после функции first: ");
        System.out.println(queue);
    }

    public static Queue<Integer> Enqueue(Queue<Integer> list, int a) {
        list.add(a);
        return list; 
    }

    public static void Dequeue(Queue<Integer> list) {
        System.out.println("Результат работы функции dequeue: " + list.remove());    
    }

    public static void First(Queue<Integer> list) {
        System.out.println("Результат работы функции first: " + list.peek());
    }

    public static ArrayList<Integer> FillArray(ArrayList<Integer> list) {
        Random random = new Random();
        for (int index = 0; index < 15; index++) {
            list.add(random.nextInt(20));
        }
        return list;
    }
}
