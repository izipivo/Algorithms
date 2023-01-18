package ru.neket.QuickSort;

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

    public static void ft_quickSort(int[] mass, int low, int high)
    {
        if (mass.length == 0)
            return ;
        if (low >= high)
            return ;
        int mediana = low + (high - low) / 2;
        int i = low;
        int j = high;
        int pivot = mass[mediana];

        while (i <= j)
        {
            while (mass[i] < pivot)
                i ++;
            while (mass[j] > pivot)
                j --;
            if (i <= j)
            {
                int tmp = mass[i];
                mass[i] = mass[j];
                mass[j] = tmp;
                i ++;
                j --;
            }
        }
        if (low < j)
            ft_quickSort(mass, low, j);
        if (high > i)
            ft_quickSort(mass, i, high);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x == 0 || x > 30000) {
            System.out.println("Error x!");
            return;
        }
        int[] mass = new int[x];
        mass = ft_randomNum(mass, mass.length);

        for (int i = 0; i != x; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("-----------------------------");
        ft_quickSort(mass, 0, mass.length - 1);
        for (int i = 0; i != x; i++) {
            System.out.println(mass[i]);
        }

    }
}
