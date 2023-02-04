import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/*Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

public class Task1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> tempList = new LinkedList<>(); // Необходимость данного временного списка обуславливается наличием нескольких вариантов исполнения метода.
        LinkedList<Integer> resultList1 = new LinkedList<>();

        FillArray(list);
        tempList.addAll(list);

        System.out.print("Исходный список" + list);
        System.out.println();
        
        MyReverse1(tempList, resultList1);
        MyReverse2(tempList);

        System.out.println();
        System.out.println("Результат по первому методу" + resultList1);
        System.out.println();
        System.out.println("Результат по второму методу" + tempList);
        System.out.println();
        
        Collections.reverse(list);
        System.out.println("Результат по встроенному методу" + list);
    }

    public static LinkedList<Integer> MyReverse1(LinkedList<Integer> list, LinkedList<Integer> resultList2) {
        for (int i = list.size() - 1; i >= 0; i--) {
            resultList2.add(list.get(i));            
        }
        return resultList2;        
    }

    public static LinkedList<Integer> MyReverse2(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);            
        }
        return list;        
    }





    public static LinkedList<Integer> FillArray(LinkedList<Integer> list) {
        Random random = new Random();
        for (int index = 0; index < 5; index++) {
            list.add(random.nextInt(10));
        }
        return list;
    }


    
}
