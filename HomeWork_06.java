package HomeWork;//Домашнее задание Рудницкий Александр
//тема Массивы  Абрамян задачи Array 20-23

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_06 {
//    public static int quarterOf(int month) {
//        int a = 0;
//        switch (month) {
//            case 1:
//            case 2:
//            case 3:
//                a = 1;
//                break;
//            case 4:
//            case 5:
//            case 6:
//                a = 2;
//                break;
//
//            case 7:
//            case 8:
//            case 9:
//                a = 3;
//                break;
//
//            default:
//                a = 4;
//        }
//        return a;
//    }
//
//    public static int sum(int[] arr) {
//        int res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                res = res + arr[i];
//            }
//        }
//        return res;
//    }

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int month = in.nextInt();
//        System.out.println("Q= " + quarterOf(month));


//        Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
//        сумму элементов массива с номерами от K до L включительно.

//        Scanner in = new Scanner(System.in);
//        int size;
//
//        do {
//            System.out.print("Inter the length of the array :");
//            size = in.nextInt();
//        } while (size <= 0);
//
//        int[] arr = new int[size];
//
//        for (int i = 0; i < (size); i++) {
//            arr[i] = i + 1;
//            System.out.print("N" + i + "=" + arr[i] + "; ");
//        }
//
//        int l;
//        int k;
//        do {
//            System.out.print("\n Inter the first position K: ");
//            k = in.nextInt();
//            System.out.print("Inter the last position L: ");
//            l = in.nextInt();
//        } while (l < k || l < 0 || k < 0 || l >= size);
//
//        int summ = 0;
//        for (int i = k; i <= l; i++) {
//            summ += arr[i];
//        }
//        System.out.println("\n Summ of positions from " + k + " to " + l + " = " + summ);

//        Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
//        Найти среднее арифметическое элементов массива с номерами от K до L
//        включительно.

//        Scanner in = new Scanner(System.in);
//        int size;
//
//        do {
//            System.out.print("Inter the length of the array :");
//            size = in.nextInt();
//        } while (size <= 0);
//
//        int[] arr = new int[size];
//
//        for (int i = 0; i < (size); i++) {
//            arr[i] = i + 1;
//            System.out.print("N" + i + "=" + arr[i] + "; ");
//        }
//
//        int l;
//        int k;
//        do {
//            System.out.print("\n Inter the first position K: ");
//            k = in.nextInt();
//            System.out.print("Inter the last position L: ");
//            l = in.nextInt();
//        } while (l < k || l < 0 || k < 0 || l >= size);
//
//        int divider = 0;
//        int summ = 0;
//        for (int i = k; i <= l; i++) {
//            divider++;
//            summ += arr[i];
//        }
//
//        double res = (double) summ / divider;
//        System.out.println("\n Average of positions from " + k + " to " + l + " = " + res);

//        Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
//        сумму всех элементов массива, кроме элементов с номерами от K до L
//        включительно.

//        Scanner in = new Scanner(System.in);
//        int size;
//
//        do {
//            System.out.print("Inter the length of the array :");
//            size = in.nextInt();
//        } while (size <= 0);
//
//        int[] arr = new int[size];
//
//        for (int i = 0; i < (size); i++) {
//            arr[i] = i + 1;
//            System.out.print("N" + i + "=" + arr[i] + "; ");
//        }
//
//        int l;
//        int k;
//        do {
//            System.out.print("\n Inter the first position K: ");
//            k = in.nextInt();
//            System.out.print("Inter the last position L: ");
//            l = in.nextInt();
//        } while (l < k || l < 0 || k < 0 || l >= size);
//
//        int summ = 0;
//        for (int i = k+1; i < l; i++) {
//            summ += arr[i];
//        }
//        System.out.println("\n Summ of positions from " + k + " to " + l + " = " + summ);

//        Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
//        Найти среднее арифметическое всех элементов массива, кроме элементов
//        с номерами от K до L включительно.

        Scanner in = new Scanner(System.in);
        int size;

        do {
            System.out.print("Inter the length of the array :");
            size = in.nextInt();
        } while (size <= 0);

        int[] arr = new int[size];

        for (int i = 0; i < (size); i++) {
            arr[i] = i + 1;
            System.out.print("N" + i + "=" + arr[i] + "; ");
        }

        int l;
        int k;
        do {
            System.out.print("\n Inter the first position K: ");
            k = in.nextInt();
            System.out.print("Inter the last position L: ");
            l = in.nextInt();
        } while (l < k || l < 0 || k < 0 || l >= size);

        int divider = 0;
        int summ = 0;
        for (int i = k + 1; i < l; i++) {
            divider++;
            summ += arr[i];
        }

        double res = (double) summ / divider;
        System.out.println("\n Average of positions from " + k + " to " + l + " = " + res);

    } // main
} // class

