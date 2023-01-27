package S2_HW;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class calculator_ver2 {
    public static Logger logger = Logger.getLogger(Task2.class.getName());
    static Scanner iScanner= new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("S2_HW/_log_calculator.txt");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        boolean flag = true;
        while(flag){
            int number1 = getInt();
            logger.log(Level.INFO, "Пользователь ввел число: " + number1);

            int number2 = getInt();
            logger.log(Level.INFO, "Пользователь ввел число: " + number2);

            char operation = getOperation();
            logger.log(Level.INFO, "Пользователь ввел операцию: " + operation);

            int result = calc(number1, number2, operation);
            logger.log(Level.INFO, "Результат: " + result);

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
