import java.time.LocalDateTime;
import java.util.Scanner;

public class sem1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.next();//nextline - если нужно несколько переменных вводить
        //System.out.println(now);
        //System.out.println("Hello world!");
        //System.out.printf("%s","Hello world!");
        System.out.println(now + " - " + name);
        
        
        iScanner.close();
    }
    
}
