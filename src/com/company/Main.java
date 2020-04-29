package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  java.util.Collections;
import java.util.LinkedHashSet;
import  java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> sNumbers = new ArrayList<>();
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < 2; ) {                //цикл позвоялет вводит бесконечное
            String a = num.nextLine();            //количесво строк, пока не появится
            if (!a.equals("finish")) {                 // слово "finish"
                sNumbers.add(a);
            } else {
                break;
            }
        }

        System.out.println("Entered String       " + sNumbers);
        List<Integer> intNumbers = new ArrayList<>();
        for (String tempVar : sNumbers) {                                // этот цикл нужен чтобы сделать
            int transTempVar = Integer.parseInt(String.valueOf(tempVar)); //массив из целых чисел
            intNumbers.add(transTempVar);
        }
        System.out.println("Entered Integer      " + intNumbers);
        Set<Integer> intNumbersWithoutDublicates = new LinkedHashSet<Integer>(intNumbers); //тут удаляем дубликаты чисел
        intNumbers.clear();                                                          //с помощью HashSet
        intNumbers.addAll(intNumbersWithoutDublicates);
        intNumbersWithoutDublicates.clear();
        System.out.println("Without Dublicates   " + intNumbers);
        Collections.sort(intNumbers, new CustomComparator());      // с помощью комператора сортируем все числа
        System.out.println("CustomComparator     " + intNumbers);      // по возрастанию,
        Collections.sort(intNumbers, new CustomComparatorTwo());      //выводим 4 вперед
        System.out.println("CustomComparatorTwo  " + intNumbers);
        Collections.sort(intNumbers, new CustomComparatorThree());    // числа больше 100 в убывающем порядке
        System.out.println("CustomComparatorThree" + intNumbers);




    }
}
