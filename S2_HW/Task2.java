/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */

package S2_HW;
import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    public static Logger logger = Logger.getLogger(Task2.class.getName());
        
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("S2_HW/_log_Task2.txt");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int [] arr = {9, 2, 4, 1, 5};
        System.out.println("Исходный массив: ");
        logger.log(Level.INFO, "Задан изначальный массив");
        printArr(arr);

        int [] sortArr = bubbleSort(arr);
        logger.log(Level.INFO, "Получен отсортированный массив");
        
        System.out.println("Отсортированный массив: ");
        printArr(sortArr);
        }


    public static int[] bubbleSort(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                } 
            }
            logger.log(Level.INFO, "Итерация № " + i);
        }
    return arr;
        
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            logger.log(Level.INFO, "Массив напечатан");
            System.out.println(" \n");
    }
    
}
