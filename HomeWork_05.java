// домашнее задание Рудницкий Александр
// тема циклы и последовательности

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {

//        Series7. Дано целое число N и набор из N вещественных чисел. Вывести в
//        том же порядке округленные значения всех чисел из данного набора (как
//        целые числа), а также сумму всех округленных значений
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the quantity N:");
//        int n = in.nextInt();
//        double sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("inter the number N" + i + " :");
//            double ni = in.nextDouble();
//            double niNew = Math.round(ni);
//            System.out.println("Rounded number is : " + niNew);
//            sum = sum + niNew;
//        }
//        System.out.println("Total : " + sum);

//            Series8.Дано целое число N и набор из N целых чисел.Вывести в том же
//            порядке все четные числа из данного набора и количество K таких чисел.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the quantity N:");
//        int n = in.nextInt();
//        int k = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Inter the number N" + i + " :");
//            int ni = in.nextInt();
//            boolean res = ni % 2 == 0;
//            if (res == true) {
//            System.out.println("The number N" + i + " is even :" + ni);
//            k = k + 1;
//            } else   System.out.println("The number N" + i + " is odd ");
//        }
//        System.out.println("Total quantity on even number is: " + k);

//        Series9. Дано целое число N и набор из N целых чисел. Вывести в том же
//        порядке номера всех нечетных чисел из данного набора и количество K
//        таких чисел.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the quantity N:");
//        int n = in.nextInt();
//        int k = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Inter the number N" + i + " :");
//            int ni = in.nextInt();
//            boolean res = ni % 2 != 0;
//            if (res == true) {
//            System.out.println("The number N" + i + " is odd :" + ni);
//            k = k + 1;
//            } else   System.out.println("The number N" + i + " is even ");
//        }
//        System.out.println("Total quantity on even number is: " + k);


//            Series10.Дано целое число N и набор из N целых чисел.Если в наборе
//            имеются положительные числа, то вывести TRUE;
//            в противном случае вывести FALSE.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the quantity N:");
//        int n = in.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Inter the number N" + i + " :");
//            int ni = in.nextInt();
//            boolean res = true;
//            if (ni >= 0) {
//                System.out.println("The  N" + i + " is a positive number :" + res);
//            } else System.out.print("FALSE");
//        }

//            Series11.Даны целые числа K, N и набор из N целых чисел.Если в наборе
//            имеются числа, меньшие K, то вывести TRUE;
//            в противном случае вывести FALSE.

        Scanner in = new Scanner(System.in);
        System.out.print("Inter the number K:");
        int k = in.nextInt();
        System.out.print("Inter the quantity N:");
        int n = in.nextInt();
        boolean res = false;

        for (int i = 1; (i <= n) || (res == true); i++) {
            System.out.print("Inter the number N" + i + " :");
            int ni = in.nextInt();
            if (ni < k) {
                res = true;
                System.out.println("At least one number smaller than " + k + " result:" + res);
            } else System.out.println("FALSE");
        }

    }
}
