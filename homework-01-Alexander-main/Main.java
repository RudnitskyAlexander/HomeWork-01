package com.company;
// Занятие 4. Условные операторы.

import com.sun.deploy.uitoolkit.DelegatingPluginUIToolkit;
import sun.security.x509.DeltaCRLIndicatorExtension;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите трехзначное число ");
//        int a = in.nextInt();
//        int sot = a / 100;
//        int des = (a / 10) % 10;  // (a%100)/10;
//        int ed = a % 10;
//        boolean res = (sot < des) && (des < ed) && (sot != ed);
//        System.out.println("Результат: " + res);
//
//        if (условие) {
//            оператор1;//оператор 1 выполняется если результат условия "true"
//        } else {
//            оператор2; //оператор 1 выполняется если результат условия "false"
//        }

//        If1. Дано целое число. Если оно является положительным, то прибавить к
//        нему 1; в противном случае не изменять его. Вывести полученное число.
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число ");
//        int a = in.nextInt();
//        if (a > 0) {
//            a++;
//        }
//        System.out.println("Результат: " + a);

//        If2. Дано целое число. Если оно является положительным, то прибавить к
//        нему 1; в противном случае вычесть из него 2. Вывести полученное число.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число ");
//        int a = in.nextInt();
//        if (a > 0) {
//            a++;
//        }
//        else {
//            a=a-2;
//        }
//        System.out.println("Результат: " + a);

//        If3. Дано целое число. Если оно является положительным, то прибавить к
//        нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
//        заменить его на 10. Вывести полученное число.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число ");
//        int a = in.nextInt();
//        if (a > 0) {
//            a++;
//        }
//        if (a == 0) {
//            a = 10;
//        }
//        else {
//            a = a - 2; //a-=2;
//        }
//        System.out.println("Результат: " + a);


//        If4◦
//. Даны три целых числа. Найти количество положительных чисел в исходном наборе.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a");
//        int a = in.nextInt();
//        System.out.print("Введите число b");
//        int b = in.nextInt();
//        System.out.print("Введите число c");
//        int c = in.nextInt();
//        int sum = 0;
//        if (a > 0) {
//            sum = sum ++;
//        }
//        if (b > 0) {
//            sum = sum + +;
//        }
//        if (c > 0) {
//            sum = sum ++;
//        }
//        System.out.println("Результат: " + sum);

//        If5. Даны три целых числа. Найти количество положительных и количество
//        отрицательных чисел в исходном наборе.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//        System.out.print("Введите число c ");
//        int c = in.nextInt();
//        int posit = 0;
//        int negat = 0;
//
//        if (a > 0) {
//            posit++;
//        }
//        if (b > 0) {
//            posit++;
//        }
//        if (c > 0) {
//            posit++;
//        }
//
//        if (a < 0) {
//            negat++;
//        }
//        if (b < 0) {
//            negat++;
//        }
//        if (c < 0) {
//            negat++;
//        }
//
//        System.out.println("Результат +: " + posit);
//        System.out.println("Результат -: " + negat);

//        If6◦
//. Даны два числа. Вывести большее из них.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//
//        if (a > b){
//            System.out.print("Большее число " + a);
//        }
//        else{
//            System.out.print("Большее число " + b);}

//        If7. Даны два числа. Вывести порядковый номер меньшего из них.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//
//        if (a > b){
//            System.out.print("Порядковый номер меньшего числа 2 ");
//        }
//        else{
//            System.out.print("Порядковый номер меньшего числа 1" );}

//        If8◦
//. Даны два числа. Вывести вначале большее, а затем меньшее из них.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//
//        if (a > b) {
//            System.out.print("большее число " + a + " меньшее число " + b);
//        } else {
//            System.out.print("большее число " + b + " меньшее число " + a);
//        }


//        If9. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,
//        а в B — большее. Вывести новые значения переменных A и B.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//
//        if (b < a) {
//            int c = a;
//            a = b;
//            b = c;
//        }
//        System.out.print("a= " + a);
//        System.out.print(" b= " + b);

//        If11. Даны две переменные целого типа: A и B. Если их значения не равны, то
//        присвоить каждой переменной большее из этих значений, а если равны,
//        то присвоить переменным нулевые значения. Вывести новые значения
//        переменных A и B.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//
//        if (a!=b) {
//            if (a > b) {
//                b=a;
//            } else {a=b;}
//        }
//
//        System.out.print("a= " + a);
//        System.out.print(" b= " + b);

//        If12◦
//. Даны три числа. Найти наименьшее из них.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//        System.out.print("Введите число c ");
//        int c = in.nextInt();
//
//        if (a < b && a < c) System.out.println(a);
//        if (b < a && b < c) System.out.println(b);
//        if (c < a && c < b) System.out.println(c);

//        If13. Даны три числа. Найти среднее из них (то есть число, расположенное
//        между наименьшим и наибольшим).


//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//        System.out.print("Введите число c ");
//        int c = in.nextInt();
//
//        if (b < a && a < c) System.out.println(a);
//        if (a < b && b < c) System.out.println(b);
//        if (a < c && c < b) System.out.println(c);

//        If15. Даны три числа. Найти сумму двух наибольших из них.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a ");
//        int a = in.nextInt();
//        System.out.print("Введите число b ");
//        int b = in.nextInt();
//        System.out.print("Введите число c ");
//        int c = in.nextInt();
//
//        if (b < a && a < c) System.out.println(b+a);
//        if (a < b && b < c) System.out.println(a+c);
//        if (a < c && c < b) System.out.println(a+b);


//        If18. Даны три целых числа, одно из которых отлично от двух других, равных между собой. Определить порядковый номер числа, отличного от
//        остальных.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a ");
        int a = in.nextInt();
        System.out.print("Введите число b ");
        int b = in.nextInt();
        System.out.print("Введите число c ");
        int c = in.nextInt();
        int res = 0;

        if (a == b) res = 3;
        else if (a == c) res = 2;
        else if (b == c) res = 1;
        System.out.println(res);


    }
}
