package ru.geekbrains.lesson2_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       // doTask1();
        doTask2();

    }
    static void doTask1() {
        String[] words = {"Hello", "World", "Ivan", "Kolesov", "Hello", "hello"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
           if (counter.containsKey(words[i])) {
               counter.put(words[i], counter.get(words[i]) + 1);
           } else {
               counter.put(words[i], 1);
           }

        }
        System.out.println(counter);
    }


    static void doTask2() {
        PhoneBook pb = new PhoneBook();

        Iterator<String> it = pb.get("Ivan").iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
