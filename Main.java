import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Домашнее задание №2 студента Рудницкий Александр
//        Задачник "1000 задач по программированию" Абрамян
//        Раздел Integer, задачи: 15, 16
//        Нарисовать блок-схемы
//
//        Integer15.  Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа
//        (например, 123 перейдет в 213).

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a three digit number :");
//        int number = in.nextInt();
//        int sotny = number / 100;
//        int desiatky = (number % 100) / 10;
//        int edin = number % 10;
//        int res = desiatky * 100 + sotny*10 + edin;
//        System.out.println("Result: " + res);

//        Integer16 Дано трехзначное число. Вывести число, полученное при перестановке цифр десятков и единиц исходного числа
//        (например, 123 перейдет в 132).

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a three digit number :");
        int number = in.nextInt();
        int sotny = number / 100;
        int desiatky = (number % 100) / 10;
        int edin = number % 10;
        int res = sotny * 100 + edin * 10 + desiatky;
        System.out.println("Result: " + res);


    }
}