import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 12, 11));
        for (Integer numbers : nums) {
            if (numbers % 2 != 0) {
                System.out.println(numbers);
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 16, 1, 2, 3, 10, 4, 4, 5, 22, 5, 6, 7));
        //Collections.sort(nums);
        Set<Integer> numsSet = new HashSet<>(nums);
        Collections.sort(nums);
        for (Integer numbers : numsSet) {
            if (numbers % 2 == 0) {
                System.out.println(numbers);
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        List<String> word = new ArrayList<>(List.of("one", "two", "three", "one", "two"));
        Set<String> wordSet = new HashSet<>(word);
        System.out.println(wordSet);
    }

    public static void task4() {
        System.out.println("Задание 4");
        List<String> word = new ArrayList<>(List.of("one", "two", "three", "one", "two"));
        Set<String> wordSet = new HashSet<>(word);
        System.out.println(word.size() - wordSet.size());
    }
}