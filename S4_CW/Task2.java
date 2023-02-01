/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида 
 * text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package S4_CW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        while(true) {
            String str = iScanner.nextLine();
            if (str.equals(""))
                break;
            String[] strArr = str.split("~");//strArr[0]=name(привет), strArr[1]=number(1)
            int number = Integer.parseInt(strArr[1]);
            if (strArr[0].equals("print"))
                try{
                    System.out.println(names.get(number));
                    names.remove(number);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            else if (number!=names.size()) {
                    System.out.println("Incorrect index should be "+names.size());
                    continue;
                }
            else 
                names.add(number, strArr[0]);

        }
        iScanner.close();
    }
    
}
