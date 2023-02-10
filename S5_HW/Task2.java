/*
 * 2) Пусть дан список сотрудников:Иван Иванов и т.д.
 * Написать программу, которая найдет и выведет повторяющиеся имена 
 * с количеством повторений. Отсортировать по убыванию популярности.
 */
package S5_HW;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String[] worker = new String[] {"Иван Иванов", "Петр Петров", "Глеб Белов", "Кристина Пупкина",
                "Юля Терехина", "Иван Стоповцев", "Людмила Зыкова", "Ольга Манкова", "Глеб Чернышов ",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Павел Мухин",
                "Петр Вышин", "Юля Юлина", "Петр Беспалов", "Василий Васечкин", "Ольга Крутова"};
        
        ArrayList<String> workerNameSurname = GetNames(worker);
        System.out.println("Список имен работников: " + "\n" + workerNameSurname + "\n");

        Map<String, Integer> namesMap = GetMap(workerNameSurname);
        System.out.println("Хэш таблица имен с количеством их повторений: " + "\n" + namesMap + "\n");

        System.out.println("Повторяющиеся имена и количество повторений: ");
        RepeatName(namesMap);
        SortName(namesMap);
    }

    public static ArrayList<String> GetNames(String[] worker) {
        ArrayList<String> list = new ArrayList<>();
        for (String el : worker) {
            String[] temp = el.split(" ");
            list.add(temp[0]);            
        }
        return list;
    }

    public static Map<String, Integer> GetMap(ArrayList<String> workerName) {
        Map<String, Integer> mapList = new HashMap<>();
        for (int i = 0; i < workerName.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < workerName.size(); j++) {
                if (workerName.get(i).equals(workerName.get(j))) count += 1;                
            }
            if (mapList.containsKey(workerName.get(i)) == false) mapList.put(workerName.get(i), count);            
        }
        return mapList;
    }

    public static void RepeatName(Map<String, Integer> namesMap) {
        for (var el : namesMap.entrySet()) {
            if (el.getValue() > 1) System.out.printf("%s: %d; ", el.getKey(), el.getValue()); 
        }
    }

    public static void SortName(Map<String, Integer> namesMap) {
        Map<String, Integer> sortedMap1 = new LinkedHashMap<>(); //First method
        Map<String, Integer> sortedMap2 = new LinkedHashMap<>(); //Second method

        sortedMap1 = namesMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
                (e1, e2) -> e2, LinkedHashMap::new));
        
        System.out.println("\n\n" + "Отсортированная таблица по возрастанию: " + "\n" + sortedMap1 + "\n");
        
        int max = 1;
        for (int value : namesMap.values()) {
            if (value > max) max = value;
        }

        for (int i = max; i > 0; i--) {
            for (var tmp : namesMap.entrySet()) {
                String key = tmp.getKey();
                if (namesMap.get(key) == i) sortedMap2.put(key, namesMap.get(key));
            }
        }
        
        System.out.println("Отсортированная таблица по убыванию: " + "\n" + sortedMap2 + "\n");
    }

}
