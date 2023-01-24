/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 * (произведение чисел от 1 до n)
 */
package S1_HW;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        System.out.println(number);
        iScanner.close();

        if (number >= 1) {
            System.out.println(sum(number));
            System.out.println(factorial(number));
        }
        else {
            System.out.println("Введено неверное число!");
        }
    }

    public static int sum(int num) {
        int resultSum = 0;
        for (int i = 0; i <= num; i++) {
            resultSum = resultSum + i;
        }
        return resultSum;  
    }

    public static int factorial(int num) {
        while (num > 1) {
            return (num * factorial(num - 1));
        }
    return 1;
    }
    
}
