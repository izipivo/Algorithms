package ru.neket.MergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static int[] ft_randomNum(int[] result, int len)
    {
        for (int i = 0; i != len; i++)
        {
            result[i] = (int) (Math.random() * 30);
        }
        return (result);
    }

    public static void merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            aux[k++] = arr[i++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }
    }
    public static void ft_separation(int[] mass, int[] aux, int low, int high)
    {
        if (high == low)
            return ;

        int mid = (low + ((high - low) >> 1));

        ft_separation(mass, aux, low, mid);
        ft_separation(mass, aux, mid + 1, high);

        merge(mass, aux, low, mid, high);

    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x == 0 || x > 30)
        {
            System.out.println("Error x!");
            return ;
        }
        int[] mass = new int[x];
        mass = ft_randomNum(mass, mass.length);
        int[] aux = Arrays.copyOf(mass, mass.length);

        for (int i = 0; i != x; i ++) {
            System.out.println(mass[i]);
        }
        System.out.println("-----------------------------");
        ft_separation(mass, aux, 0, mass.length - 1);
        for (int i = 0; i != x; i ++) {
            System.out.println(mass[i]);
        }

    }
}
