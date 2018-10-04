package Alfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer mas[] = new Integer[10];
        for(int i = 0; i <  mas.length; i++) {
            mas[i] =  (int)(Math.random() * 100);
        }
        Arrays.sort(mas, Collections.reverseOrder());
        System.out.print("Отсортированный по убыванию массив: ");
        for(int i = 0; i <  mas.length; i++) {
            System.out.print(+mas[i] + "  ");
        }
        System.out.println();
        System.out.print("Введите число Х: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (bsearch(mas,x) == 0){
            System.out.println("В массиве нет элементов меньше X");
        }
        else System.out.println(String.valueOf(bsearch(mas,x)));
    }

    static int bsearch(Integer mas[],int x){
        int number = 0;
        for (int i = 0; i <mas.length; i++) {
            if (mas[i] < x){
                number = i;
                break;
            }
        }
        return number;
    }
}
