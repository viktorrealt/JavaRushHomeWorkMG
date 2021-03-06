package level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        int[] array = new int[20];
        int  maximum = array[0];
        int  minimum = array[0];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++)
        {

            for (int j = 0; j < array.length; j++)
            {
                if  (maximum < array[j])
                    maximum = array[j];
            }
        }

        for (int i = 0; i < array.length; i++)
        {

            for (int j = 0; j < array.length; j++)
            {
                if (minimum > array[j])
                    minimum = array[j];
            }
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
