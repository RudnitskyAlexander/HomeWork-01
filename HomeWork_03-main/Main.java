// домашнее задание №3 студента Рудницкий Александр

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//      Boolean17◦Дано целое положительное число. Проверить истинность высказывания:
//      «Данное число является нечетным трехзначным».
        Scanner in = new Scanner(System.in);
        System.out.print("Inter the three symbol number:");
        int a = in.nextInt();
        boolean res = (a % 2 != 0) && (a < 1000);
        System.out.println("Result is: " + res);


//      Boolean19◦ Проверить истинность высказывания: «Среди трех данных целых
//      чисел есть хотя бы одна пара взаимно противоположных».
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A : ");
//        int a = in.nextInt();
//        System.out.print("Inter the number B : ");
//        int b = in.nextInt();
//        System.out.print("Inter the number C :");
//        int c = in.nextInt();
//
//        boolean res = (a == Math.abs(b)) || (a == Math.abs(c)) || (b == Math.abs(c));
//        System.out.println("Result is: " + res);

//        Boolean21◦ Дано трехзначное число. Проверить истинность высказывания:
//        «Цифры данного числа образуют возрастающую последовательность».
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the three symbol number:");
//        int a = in.nextInt();
//        int sot = a / 100;
//        int des = (a / 10) % 10;
//        int ed = a % 10;
//        boolean res = (sot < des) && (des < ed) && (sot != ed);
//        System.out.println("Result is: " + res);

//        БОНУСНЫЕ ЗАДАЧИ

// Boolean18◦Проверить истинность высказывания: «Среди трех данных целых
// чисел есть хотя бы одна пара совпадающих».
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A : ");
//        int a = in.nextInt();
//        System.out.print("Inter the number B : ");
//        int b = in.nextInt();
//        System.out.print("Inter the number C : ");
//        int c = in.nextInt();
//
//        boolean res = (a == b) || (a == c) || (b == c);
//        System.out.println("Result is: " + res);

//
//       Boolean20◦Дано трехзначное число. Проверить истинность высказывания
//       «Все цифры данного числа различны».
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the three symbol number:");
//        int a = in.nextInt();
//        int sot = a / 100;
//        int des = (a / 10) % 10;
//        int ed = a % 10;
//        boolean res = (sot != des) && (des != ed) && (sot != ed);
//        System.out.println("Result is: " + res);

    }
}