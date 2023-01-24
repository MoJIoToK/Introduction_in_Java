package S1_HW;
import java.util.Scanner;

public class calculator {
    static Scanner iScanner= new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            int number1 = getInt();
            int number2 = getInt();
            char operation = getOperation();
            int result = calc(number1, number2, operation);
            System.out.println("Результат операции: " + result);    
        } 
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(iScanner.hasNextInt()){
            num = iScanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            iScanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(iScanner.hasNext()){
            operation = iScanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            iScanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
    
}
