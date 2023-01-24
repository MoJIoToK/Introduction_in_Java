import java.time.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        System.out.println("Введите имя: ");
        Scanner iScanner = new Scanner(System.in, encoding);
        String name = iScanner.nextLine();
        System.out.println(Print(name));
        iScanner.close();
    }
    public static String Print(String name) 
    {
        LocalTime now = LocalTime.now();
        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
            return("Доброе утро, " + name);
        else if (now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(12,59)))
            return("Добрый день, " + name);
        else if (now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59)))
            return("Добрый вечер, " + name);
        return("Доброй ночи, " + name);
    }
 
}


/*
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */