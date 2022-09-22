package site.telion;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Task 1. Список нечетных чисел");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer value : nums) {
            if (value % 2 == 1) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println();
        System.out.println("Task 2. Четные числа без повторений");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> result = new ArrayList<>();
        for (Integer value : nums) {
            if (!result.contains(value) && value % 2 == 0) {
                result.add(value);
            }
        }
        Collections.sort(result);
        for (Integer value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("Task 3. Уникальные слова");
        List<String> words = new ArrayList<>(List.of("hello", "world", "hello", "java", "intellij", "java", "java", "skypro", "world"));
        Set<String> result = new HashSet<>();
        for (String word : words) {
            result.add(word);
        }
        System.out.println(result);
    }

    public static void task4() {
        System.out.println();
        System.out.println("Task 4. Количество дублей");
        List<String> words = new ArrayList<>(List.of("hello", "world", "hello", "java", "intellij", "java", "java", "skypro", "world"));
        Map<String, Integer> repeatedWords = new HashMap<>();
        for (String word : words) {
            if (repeatedWords.containsKey(word)) {
                repeatedWords.put(word, repeatedWords.get(word) + 1);
            } else {
                repeatedWords.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : repeatedWords.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getValue() + " ");
            }
        }
        System.out.println();
    }
}
