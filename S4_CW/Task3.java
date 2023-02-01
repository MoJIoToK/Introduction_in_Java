/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
 * а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти
 * 
 * Collection.reverse(list);
 * 
 */

package S4_CW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        while(true) {
            String str = iScanner.nextLine();
            if (str.equals(""))
                break;
            //String[] strArr = str.split();//strArr[0]=name(привет), strArr[1]=number(1)
            //int number = Integer.parseInt(strArr[1]);
            if (str.equals("print"))
                try{
                    Collections.reverse(strList);
                    System.out.println(strList);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            else if (str.equals("revert")) {
                    strList.remove(strList.get(strList.size() - 1));
                    System.out.println(strList);
                    //continue;
                }
            else 
                strList.add(str);

        }
        iScanner.close();
        
    }
    
}
