/*
 * Напишите метод, который принимает на вход строку (StringBulder) и определяет 
 * является ли строка палиндромом (возвращает boolean значение).
 * equals и StringBulder для revers

 */

package S2_CW;
import java.util.Scanner;

public class Task3 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        StringBuilder SB = new StringBuilder(iScanner.nextLine());
        System.out.println(check(SB));
    }
    public static Boolean check(StringBuilder SB){
        StringBuilder revSB = new StringBuilder(SB).reverse();
        return revSB.toString().equals(SB.toString());
    }
}

