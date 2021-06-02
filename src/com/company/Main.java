package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Создаю массив
        String[] peoples = new String[3];
        peoples[0] = "Макс";
        peoples[1] = "Мурат";
        peoples[2] = "Арген";
        String[] peoples2 = Arrays.copyOf(peoples, peoples.length +1);
        peoples2[3] = "Доброе утро";
        System.out.println(Arrays.toString(peoples));
        peoples = peoples2;
        System.out.println(Arrays.toString(peoples));
        System.out.println("Доброго дня");
        Scanner scanner = new Scanner(System.in);
        int getName = Integer.parseInt(scanner.nextLine());

        switch (getName) {
            case 0:
                System.out.println("Привет! " + peoples[0]);
            case 1:
                System.out.println("Добрый день " + peoples[1]);
            case 2:
                System.out.println("Добрый вечер " + peoples[2]);
                return;
            case 3:
                System.out.println("Спокойной ночи!");
        }
    }
}
