package Les2;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] arg) {

//        Integer1. Дано расстояние L в сантиметрах. Используя операцию деления наце-ло,
//        найти количество полных метров в нем (1 метр = 100 см).

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите целое число - количестов сантиметров: ");
//        int L = in.nextInt();
//        System.out.println(L/100+" метров");
//
//        Integer3°.  Дан  размер  файла  в  байтах.  Используя  операцию  деления  нацело, найти  количество
//        полных  килобайтов,  которые  занимает  данный  файл (1 килобайт = 1024 байта).
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число байтов: ");
//        int bytes = in.nextInt();
//        System.out.println(bytes / 1024 + " килобайтов");

//        Integer6. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы).
//        Для нахождения десятков исполь-зовать  операцию  деления  нацело,  для  нахождения  единиц — операцию взятия остатка от деления.
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите количество десятков: ");
//        int desatk = in.nextInt();
//        System.out.print("Введите количество единиц: ");
//        int edinit = in.nextInt();
//
//        System.out.println(desatk / 10 + " десятков");
//        System.out.println(edinit % 10 + " единиц");
//

//        Integer7. Дано двузначное число. Найти сумму и произведение его цифр.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите двухзначное число: ");
//        int number = in.nextInt();
//        int desiatky = number / 10;
//        int edinitsa = number % 10;
//        int proisved = desiatky * edinitsa;
//        System.out.println("Сумма цифр: " + (desiatky + edinitsa));
//        System.out.println("Произведение цифр: " + proisved);

//     Integer8◦ Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите двухзначное число: ");
//        int number = in.nextInt();
//        int desiatky = number / 10;
//        int edinitsa = number % 10;
//        int tempor = edinitsa;
//        edinitsa = desiatky;
//        desiatky = tempor;
//        System.out.println("Итог: " + desiatky + edinitsa);

//        Integer9◦ Дано трехзначное число. Используя одну операцию деления нацело,
//                вывести первую цифру данного числа (сотни).
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int sotny = number / 100;
//        System.out.println("Итог: " + sotny);
//
//        Integer10◦Дано трехзначное число. Вывести вначале его последнюю цифру (единицы), а затем — его среднюю цифру (десятки).
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int edinitsa = number % 10;
//        System.out.println("Единицы: " + edinitsa);
//        int desiatk = (number%100)/10;
//        System.out.println("Десятки: " + desiatk);

//  Integer11◦ Дано трехзначное число. Найти сумму и произведение его цифр.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int third = number%10;
//        int second = (number%100)/10;
//        int first = number/100;
//        System.out.println("Сотни: " + first);
//        System.out.println("Десятки: " + second);
//        System.out.println("Единицы: " + third);
//        System.out.println("Сумма: " + (first+second+third));
//        System.out.println("Произведение: " + (first*second*third));

//    Integer12◦. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int third = number % 10;
//        int second = (number % 100) / 10;
//        int first = number / 100;
//        System.out.println("Сотни: " + first);
//        System.out.println("Десятки: " + second);
//        System.out.println("Единицы: " + third);
//        int temp = first;
//        first = third;
//        third = temp;
//        int res = 100 * first + 10 * second + third;
//        System.out.println("Итог: " + res);

//        Integer13◦
//. Дано трехзначное число. В нем зачеркнули первую слева цифру и
//        приписали ее справа. Вывести полученное число.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = in.nextInt();
        int third = number % 10;
        int second = (number % 100) / 10;
        int first = number / 100;

        int sotny = number / 100;
        int ost = number % 100;
        int res = ost * 10 + sotny;
        System.out.println("Итог: " + res);


    }
}
