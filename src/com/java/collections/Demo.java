package com.java.collections;

import java.util.*;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

                                                            //************************* HashSet
        Set<String> ProgrammingLanguage = new HashSet<>();
        ProgrammingLanguage.add("Java");
        ProgrammingLanguage.add("C");
        ProgrammingLanguage.add("C++");
        ProgrammingLanguage.add("Python");
        ProgrammingLanguage.add("Scala");
        ProgrammingLanguage.add("JavaScript");

//        System.out.println(ProgrammingLanguage);
//
//        //Creating hashset with constructor.
//        Set<String> NextProgrammingLang = new HashSet<>(ProgrammingLanguage);
//        System.out.println(NextProgrammingLang);
//
//        //add values using list
//        List<String> AddNextLanguage = new ArrayList<>();
//        AddNextLanguage.add(".Net");
//        AddNextLanguage.add("C#");
//
//        NextProgrammingLang.addAll(AddNextLanguage);
//        System.out.println(AddNextLanguage);

        //*************Iterator with for, forEach, Iterator, while and with lambda expression
//        for (String course : ProgrammingLanguage) {
//            System.out.println(course);
//        }
//
//         for (Iterator<String> iterator = ProgrammingLanguage.iterator(); iterator.hasNext();) {
//             String course = (String)  iterator.next();
//             System.out.println(course);
//         }
//
//         Iterator<String> iterator = ProgrammingLanguage.iterator();
//         while (iterator.hasNext()) {
//             String course =(String) iterator.next();
//         }

        //Lambda expression.
         ProgrammingLanguage.forEach(course -> System.out.println(course));

        //***********************remove, removeall, clear
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//
//        //remove method
//        boolean result = numbers.remove(1);
////        System.out.println("Remove method result ->" +result );
////        System.out.println(numbers);
//
//        Set<Integer> evenNumbers = new HashSet<>();
//        evenNumbers.add(2);
//        evenNumbers.add(4);
//        evenNumbers.add(6);
//        evenNumbers.add(8);
//        evenNumbers.add(10);
//
//        numbers.removeAll(evenNumbers);
//        System.out.println(evenNumbers);
//        System.out.println(numbers);
//
//        //clear method
//        numbers.clear();
//        System.out.println(numbers);

                                                            //************************* List Interface
//        List<String> list = new ArrayList<>();
//        list.add("element1");         //can contain duplicate value and null value
//        list.add("element1");
//        list.add("element2");
//        list.add("element3");
//        System.out.println(list);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(3));

                                                            //************************* Collections
//        Collection<String> foodcollection = new ArrayList<>();
//        foodcollection.add("Apple");
//        foodcollection.add("Orange");
//        foodcollection.add("Grapes");
//        foodcollection.add("Pineapple");
//        System.out.println(foodcollection);
//
//        foodcollection.remove("Pineapple");
//        System.out.println(foodcollection);
//
//        System.out.println(foodcollection.contains("Apple"));
//        foodcollection.forEach((elements) -> {
//            System.out.println(elements);
//        });
    }
}
