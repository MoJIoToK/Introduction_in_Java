/*
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */

package S4_CW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) 
        {
            list1.add(i);            
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) 
        {
            list2.add(i);            
        }
        end = System.nanoTime();
        System.out.println(end - start);        
    }
    
}
