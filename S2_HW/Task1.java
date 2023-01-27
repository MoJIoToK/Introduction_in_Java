/*
 * 1) Дана строка sql-запроса "select * from students where ". Сформируйте 
 * часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации 
 * приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: 
 * String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
 * Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
 */
package S2_HW;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите имя: ");
        String name = iScanner.nextLine();

        System.out.print("Введите страну: ");
        String country = iScanner.nextLine();

        System.out.print("Введите город: ");
        String city = iScanner.nextLine();

        System.out.print("Введите возраст: ");
        String age = iScanner.nextLine();


        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name", name);
        params1.put("country", country);
        params1.put("city", city);
        params1.put("age", age);
        System.out.println(getQuery(params1));
    }
    public static StringBuilder getQuery(Map<String, String> params)
    {
      StringBuilder stringBuilder = new StringBuilder();
      for (Map.Entry<String, String> entry : params.entrySet()) {
        if (entry.getValue() != null) {
          if (stringBuilder.toString().equals("")) {
            stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
          } else {
            stringBuilder.append(" and ").append(entry.getKey()).append(" = '")
                .append(entry.getValue()).append("'");
          }
        }
  
      }
      return stringBuilder;
    }
    
}
    
