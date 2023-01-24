/**
 * program
 */
import java.util.Scanner;
public class program {
    public static void main(String[] args) {// метод main - точка входа(с какого места стартует программа)
        
        // float f = 123.45f;//f - преобразование во float
        // String s = "    2";
        // char ch = '{';
        // char ch1 = 123; // неявное преобразование
        // boolean a = true || false;
        // boolean b = true ^ true;
        // boolean c = true && false;
        // var i = 123;
        // int j = 23_123_34;//при выводе нижние подчеркивания не замечает
        // String sr = "qwerty";
        // sr.charAt(1);
        // int h = 123;
        // int k = 1;
        // k = k-- - --k;
        // int o = 18; // Пример с побитовой операцией
        // // 10010 
        // //o = o << 1;
        // int u = 5;
        // int t = 2;
        // //101
        // //010
        // //111 - |
        // //000 - &
        // boolean p = true;
        // boolean y = true;
        // String q = "qwer"; // 4, 0..3
        // //boolean v = q.length() >= 5 && q.charAt(4) == '1';
        // boolean v = q.length() >= 5 & q.charAt(4) == '1';
        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

        // int[] arr1[] = new int[3][5];
        // for (int[] line : arr1) {
        //     for (int item : line) {
        //         System.out.printf("%d ", item);
        //     }
        // System.out.println();
        // }

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        String s2 = "qwe";
        int a= 123;
        String q1 = s2+a; //конкатенация
        
        // System.out.println(s);
        // System.out.println(f);
        // System.out.println(ch);
        // System.out.println(ch1);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(getType(i));
        // System.out.println(j);
        // System.out.println(sr);
        // System.out.println(h);
        // System.out.println(++h);
        // System.out.println(k);
        // System.out.println(o >> 1); // 1001
        // System.out.println(u | t); // 111
        // System.out.println(u & t); // 000
        // System.out.println(p & y);
        // System.out.println(p && y); // быстрая операция
    //     // System.out.println(v);
    // }
    // static String getType(Object o){
    //     return o.getClass().getSimpleName();
        System.out.println(q1);
    }
    
}
/*
 * 
 * комментарий писать так (/ и *)
 * Базовая единица - класс. Основной метод - main. Принимает на вход массив строк.
 */

/*
 * 
 */

 /*Типы данных 
 *  - ссылочные (массивы и т.д.)
 *  - примитивные (boolean, int, short, long, float, double, Char)
 * short = 
 */
/*
 * Объявление переменной
 * <тип><идентификатор>;
 * <идентификатор> = <значение>;
 * всегда нужно класть в переменную какое-то значение, либо `null`. Иначе программа не будет работать
 * 
 * = - присваивание
 * ++, -- - инкремент, декремент. Приоритет операции инкремента ниже, чем вывод в консоль. Нужно писать ++ перед переменной
 * Постфиксный/Префиксный инкремент
 * >=, <=
 * && и &, если ставить два знака, то если в одном условии ошибка, программа не пойдет смотреть вторую часть.
 * 
 * Преобразование 
 * int i = 123; double d = i; - неявно
 * b = Byte.parseByte("1234"); - явно
 */


