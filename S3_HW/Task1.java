/*
 * Реализовать алгоритм сортировки слиянием
 */

package S3_HW;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {17, 3, 6, 1, 2, 234, 0};
        PrintArray(array);
        System.out.println();
        MergeSort(array);
        PrintArray(array);
    }

    public static void MergeSort(int[] array) 
    {
        if(array.length < 2)
        {
            return;
        }

        //Деление исходного массива на подмассивы одинакового размера
        int mid = array.length / 2;
        int[] left = new int[mid]; //Создание подмассива для левой части исходного массива
        int[] right = new int[array.length - mid]; //Создание подмассива для правой части исходного массива (количество элементов либо равно левому, либо больше)
        
        for (int i = 0; i < mid; i++) //заполнение левого подмассива
        {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) //заполнение правого подмассива
        {
            right[i - mid] = array[i];
        }
        MergeSort(left); //Рекурсия функции MergeSort для левого подмассива
        MergeSort(right); //Рекурсия функции MergeSort для правого подмассива
        Merge(array, left, right);
    }
    
    //
    public static void Merge(int[] targetArray, int[] array1, int[] array2) {
        int array1MinIndex = 0;
        int array2MinIndex = 0;
        int targetArrayMinIndex = 0;

        // Сравнение элементов первого подмассива и второго для того чтобы занести меньший в целевой массив
        while(array1MinIndex < array1.length && array2MinIndex < array2.length){

            if (array1[array1MinIndex] <= array2[array2MinIndex])
            {
                targetArray[targetArrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            }
            else
            {
                targetArray[targetArrayMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }
            targetArrayMinIndex++;
        }

        //Добавление в целевой массив элементов первого подмассива, если у второго подмассива закончились элементы
        while(array1MinIndex < array1.length){
            targetArray[targetArrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            targetArrayMinIndex++;
        }

        //Добавление в целевой массив элементов второго подмассива, если у первого подмассива закончились элементы
        while(array2MinIndex < array2.length){
            targetArray[targetArrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            targetArrayMinIndex++;
        }
    }

    //Вывод массива в консоль
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } 
    }
}
