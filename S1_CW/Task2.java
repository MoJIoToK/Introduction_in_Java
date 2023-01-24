/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
Найти максимальное количество подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом)
 */

public class Task2 {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
    
        fillArray(arr1);
        printArr(arr1);
        findMaxCount(arr1);   
        }
    
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*2);//[0, 1) * 2 -> [0, 2). 2 Не включается
        }
    }

    public static void printArr(int[] arr) {
        for (var el : arr) {
            System.out.print(el + " ");            
        }
    }

    public static void findMaxCount(int[] arr) {
        int count = 1;
        int result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] && arr[i] == 1){
                count ++;
                if (count > result) result = count;
            }
            else
                count = 1;
        }
        System.out.println("\n" + result);
    }

}
