/*
 * Напишите метод, который сжимает строку. Пример: вход aaaabbbcddad. Выход abcd
Подсказка charAt(i) и indefOf(s)
 */

package S2_CW;
import java.util.Scanner;

public class Task2 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = "aaaabbbcddad4qweqrbvx";
        System.out.println(CompresString(str));
        
    }
    
    public  static String CompresString(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(res.indexOf(str.charAt(i)) == -1) res += str.charAt(i);  
        }
        return res;

    }
}
