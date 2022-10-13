package HomeWork;

import java.util.Random;


public class HomeWork_07_1_function {

	public static void main(String[] args) {

//		Вариант 2
//		1. Задан массив A, содержащий 12 целых случайных чисел от -5 до 5.
//		Найти сумму элементов массива.

//		int size = 12;
//		int min = -5;
//		int max = 5;
//
//		int[] arr = fillArr(size, min, max);
//
//		printArr(arr);
//		System.out.println("\n Sum of the array is " + sumArr(arr));

//		2. Задан массив, который содержит 13 случайных целых чисел от -12 до 12.
//		Найти произведение отрицательных элементов массива.

//		int size = 13;
//		int min = -12;
//		int max = 12;
//
//		int[] a = fillArr(size, min, max);
//
//		printArr(a);
//		System.out.println("\n Result of multiply of the negative numbers is : " + multNegat(a));

//		3. Задан массив, который содержит 11 случайных целых чисел от 0 до 20.
//		Найти количество элементов массива, которые делятся на 3 или на 5 или на 7.

//        int size = 11;
//		int min = 0;
//		int max = 20;
//
//		int[] a = fillArr(size, min, max);
//    	printArr(a);
//		System.out.println(" ");
//		System.out.println("\n The quantity of numbers which divide on 3 or 5 or 7 are: " + divRes(a));

//		4. Задан массив из 15 целых чисел  от 0 до 25.
//		Найти сумму элементов массива, которые являются нечетными числами

		int size = 15;
		int min = 0;
		int max = 25;

		int[] a = fillArr(size, min, max);

		printArr(a);
		System.out.println("\n");
		System.out.println("\n The sum of odd elements are : " + sumOdd(a));


	}//class

	static int[] fillArr(int fsize, int min, int max) {
		int size = fsize;
		int[] a = new int[size];
		Random gen = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd(min, max);
		}
		return a;
	}

//Random gen = new Random();
//int k= gen.nextInt(21)-10 // from -10 to 10;
// in the breckets are quantity of the numerous
// after brackets summ the left border of the line

	static int rnd(int min, int max) {
		max = max - min;
		return (int) (Math.random() * ++max) + min;
	}

	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static int sumArr(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	static int multNegat(int[] a) {
		int multNegat = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 1 && a[i] != 0) {
				multNegat = multNegat * a[i];
			}
		}
		return multNegat;
	}

	static int divRes(int[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0 || a[i] % 5 == 0 || a[i] % 7 == 0) {
				res = res + 1;
				System.out.print(a[i] + " ");
			}
		}
		return res;
	}

	static int sumOdd(int[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				res = res + a[i];
				System.out.print(a[i] + " ");
			}
		}
		return res;
	}

} // main


