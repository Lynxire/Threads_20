package Task1;

import java.util.Scanner;

public class Task1{
    public static int[] task(){
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        System.out.println("Заполните массив значениями");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Значения в массиве: ");
        for (int arr: array){
            System.out.print(arr + " ");
        }
        System.out.println();

        return array;
    }




}
