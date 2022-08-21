// Домашнее задание №4 условные операторы
//студент Рудницкий Александр
// обязательные задачи № 8, 10, 13, 20, 21, 24, 26

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) {


//        If8◦. Даны два числа. Вывести вначале большее, а затем меньшее из них.

//        Scanner in = new Scanner(System.in);
//        System.out.println(" Please inter the first number : ");
//        int a = in.nextInt();
//        System.out.println(" Please inter the second number : ");
//        int b = in.nextInt();
//
//        if (a > b) System.out.println(" The number " + a + "bigger than " + b);
//        else System.out.println(" The number " + b + " bigger than " + a);


//        If10. Даны две переменные целого типа: A и B. Если их значения не равны,
//        то присвоить каждой переменной сумму этих значений, а если равны,
//        то присвоить переменным нулевые значения. Вывести новые значения переменных A и B.

//        Scanner in = new Scanner(System.in);
//        System.out.println(" Please inter the first number A : ");
//        int a = in.nextInt();
//        System.out.println(" Please inter the second number B : ");
//        int b = in.nextInt();
//
//        if (a != b) {
//            a = a + b;
//            b = a;
//            System.out.println(" A= " + a + " B= " + b);
//        } else if (a == b) {
//            a = 0;
//            b = 0;
//            System.out.println(" A= " + a + " B= " + b);
//        }

//        If13. Даны три числа. Найти среднее из них (то есть число, расположенное
//        между наименьшим и наибольшим).

//        Scanner in = new Scanner(System.in);
//        System.out.print(" Please inter the first number A : ");
//        int a = in.nextInt();
//        System.out.print(" Please inter the second number B : ");
//        int b = in.nextInt();
//        System.out.print(" Please inter the third number C : ");
//        int c = in.nextInt();
//
//        if (a > b && a < c)
//            System.out.println(" the middle number is : " + a);
//        else if (a < b && b < c)
//            System.out.println(" the middle number is : " + b);
//        else if (c > b && c < a)
//            System.out.println(" the middle number is : " + c);

//        If20. На числовой оси расположены три точки: A, B, C. Определить, какая из
//        двух последних точек (B или C) расположена ближе к A, и вывести эту
//        точку и ее расстояние от точки A.
//
//        Scanner in = new Scanner(System.in);
//        System.out.print(" Please inter the first point A : ");
//        int a = in.nextInt();
//        System.out.print(" Please inter the second point B : ");
//        int b = in.nextInt();
//        System.out.print(" Please inter the third point C : ");
//        int c = in.nextInt();
//
//        if (Math.abs(a - b) < Math.abs(a - c))
//            System.out.println(" The closest point to A point is B: " + Math.abs(a - b));
//        else System.out.println(" The closest point to A point is C: " + Math.abs(a - c));


//        If21. Даны целочисленные координаты точки на плоскости. Если точка совпадает с началом координат,
//        то вывести 0. Если точка не совпадает с началом координат, но лежит на оси OX или OY,
//        то вывести соответственно 1 или 2.
//        Если точка не лежит на координатных осях, то вывести 3.

//        Scanner in = new Scanner(System.in);
//        System.out.print(" Please inter the value of X : ");
//        int x = in.nextInt();
//        System.out.print(" Please inter the value of Y : ");
//        int y = in.nextInt();
//
//        if (x == 0 && y == 0)
//            System.out.println("The point in the center of coordinates : 0");
//        else if (x == 0 && y != 0)
//            System.out.println("The point belongs axis X : 1");
//        else if (x != 0 && y == 0)
//            System.out.println("The point belongs axis Y : 2");
//        else if (x != 0 && y != 0)
//            System.out.println("The point not belongs axis X or Y : 3");

//        If24. Для данного вещественного x найти значение следующей функции f,
//        принимающей вещественные значения:
//        f (x) = 2·sin(x), если x > 0,
//                6 − x, если x ≤ 0.

//        Scanner in = new Scanner(System.in);
//        System.out.print(" Please inter the value of X : ");
//        double x = in.nextInt();
//        double res = 0;
//
//        if (x <= 0){
//            res = 6 - x;
//            System.out.println("The function f (x)=6 - x is : " + res);}
//        else{
//            res = 2 * Math.sin(x);
//            System.out.println("The function f (x)=2*sin(x) is : " + res);}

//        If26◦. Для данного вещественного x найти значение следующей функции f,
//                принимающей вещественные значения:
//                −x, если x ≤ 0,
//         f (x) = x^2, если 0 < x < 2,
//                 4, если x ≥ 2.

        Scanner in = new Scanner(System.in);
        System.out.print(" Please inter the value of X : ");
        double x = in.nextDouble();
        double res = 0;

        if (x <= 0) {
            res = -x;
            System.out.println("The function f (x)= - x is : " + res);
        } else {
            if (x >= 2) {
                res = 4;
                System.out.println("The function f (x)=4 is : " + res);
            } else {
                res = x * x;
                System.out.println("The function f (x)=x^2 is : " + res);
            }
        }


    } // main
} // class
