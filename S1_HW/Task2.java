/*
 * Вывести все простые числа от 1 до 1000
 */
package S1_HW;

public class Task2 {
    public static void main(String[] args) {
        int number = 1000;
        System.out.println(number);

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i + "; ");
            }
        }
        
    }
    
}
