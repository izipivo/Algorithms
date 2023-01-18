package ru.neket.CocktailSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] ft_randomNum(int[] result, int len)
    {
        for (int i = 0; i != len; i++)
        {
            result[i] = (int) (Math.random() * 3000);
        }
        return (result);
    }

    public static void ft_sort(int[] sortMass)
    {
        int tmp = 0;
        int left = 0;
        int right = sortMass.length - 1;

        do {
            for (int i = left; i < right; i ++)
            {
                if (sortMass[i] > sortMass[i + 1]) {
                    tmp = sortMass[i + 1];
                    sortMass[i + 1] = sortMass[i];
                    sortMass[i] = tmp;
                }
            }
            right --;
            for (int i = right; i > left; i --)
            {
                if (sortMass[i] < sortMass[i - 1]) {
                    tmp = sortMass[i - 1];
                    sortMass[i - 1] = sortMass[i];
                    sortMass[i] = tmp;
                }
            }
            left ++;
        } while (left < right);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x == 0 || x > 30) {
            System.out.println("Error x!");
            return;
        }
        int[] mass = new int[x];
        mass = ft_randomNum(mass, mass.length);

        for (int i = 0; i != x; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("-----------------------------");
        ft_sort(mass);
        for (int i = 0; i != x; i++) {
            System.out.println(mass[i]);
        }
    }
}
