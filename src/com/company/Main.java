package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Напишите числа: ");
        Scanner a = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        if (a.hasNextInt()) {
            while (a.hasNext()) {
                int c = a.nextInt();
                array.add(c);
                if (c == 0) {
                    break;
                }
            }
            int c = 0;
            for (int i = 0; i < array.size(); i++) {
                c += array.get(i);
            }
            System.out.println("Сумма всех чисел: " + c);
        }
        else {
            System.out.println("Пишите только натуральные числа!");
        }
    }
}