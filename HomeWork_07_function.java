package HomeWork;//Домашнее задание Рудницкий Александр
//тема Массивы  Абрамян задачи Proc 17-21

import java.util.Scanner;

public class HomeWork_07_function {
	public static void main(String[] args) {

//    Proc17. Описать функцию rootsCount(A, B, C) целого типа, определяющую
//    количество корней квадратного уравнения A·x^2 + B·x + C = 0 (A, B, C —
//    вещественные параметры, A != 0).
//    С ее помощью найти количество корней для каждого из трех квадратных уравнений с данными коэффициентами.
//    Количество корней определять по значению дискриминанта:
//    D = B^2 − 4·A·C.

		for (int i = 0; i < 3; i++){

			Scanner in = new Scanner(System.in);
			int a;
			do {
				System.out.print("Please enter A : ");
				a = in.nextInt();
			}
			while (a == 0);

			System.out.print("Please enter B : ");
			int b = in.nextInt();
			System.out.print("Please enter C : ");
			int c = in.nextInt();

			rootsCount(a, b, c);
			System.out.println(" ");
		}


//    Proc18. Описать функцию circleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное). С помощью этой функции
//    найти площади трех кругов с данными радиусами. Площадь круга радиуса R вычисляется по формуле S = π·R^2. В качестве значения π использовать 3.14.
//		double radius;
//		Scanner in = new Scanner(System.in);
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print("Please inter the radius of the circle R : ");
//			radius = in.nextDouble();
//			while (radius <= 0) {
//				System.out.println("You entered incorrect value R. Please inter R again.");
//				radius = in.nextDouble();
//			}
//			System.out.println("Square of the circle with R = " + radius + " is : " + circleS(radius));
//		}

//    Proc19. Описать функцию ringS(R1, R2) вещественного типа, находящую площадь кольца, заключенного между двумя окружностями с общим центром
//    и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2).
//    С ее помощью найти площади трех колец, для которых даны внешние и внутренние радиусы. Воспользоваться формулой площади круга радиуса R: S = π·R^2.
//    Вкачестве значения π использовать 3.14.

//		Scanner in = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			System.out.print("Please enter the radius of first ring R1 (biggest): ");
//			double radius1 = in.nextDouble();
//			System.out.print("Please enter the radius of second ring R2 (smaller) :");
//			double radius2 = in.nextDouble();
//
//			while (radius1 <= radius2 || radius1 <= 0 || radius2 <= 0) {
//				System.out.println("You entered incorrect value. Please try again :");
//				System.out.print("Please enter the radius of first ring R1 (biggest): ");
//				radius1 = in.nextDouble();
//				System.out.print("Please enter the radius of second ring R2 (smaller) :");
//				radius2 = in.nextDouble();
//			}
//			System.out.println("The square of the ring with R1= " + radius1 + " and R2= " + radius2 + " is : " + ringS(radius1, radius2));
//			System.out.println(" ");
//		}

//    Proc20. Описать функцию triangleP(a, h), находящую периметр равнобедренного треугольника по его основанию a и высоте h, проведенной к
//    основанию (a и h — вещественные). С помощью этой функции найти
//    периметры трех треугольников, для которых даны основания и высоты.
//    Для нахождения боковой стороны b треугольника использовать теорему
//    Пифагора:
//    b^2 = (a/2)^2 + h^2.

//		Scanner in = new Scanner(System.in);
//		double base;
//		double height;
//
//		for (int i = 0; i < 3; i++) {
//			do {
//				System.out.print("Please enter the length of the triangle base a: ");
//				base = in.nextDouble();
//				System.out.print("Please enter the lenght of the triangle height h: ");
//				height = in.nextDouble();
//			}
//			while (base <= 0 || height <= 0);
//
//			System.out.println("Perimeter of triangle is : " + triangleP(base, height));
//			System.out.println(" ");
//		}

//    Proc21◦. Описать функцию sumRange(A, B) целого типа, находящую сумму
//    всех целых чисел от A до B включительно (A и B — целые). Если A > B,
//    то функция возвращает 0. С помощью этой функции найти суммы чисел
//    от A до B и от B до C, если даны числа A, B, C.

//		Scanner in = new Scanner(System.in);
//		System.out.println("Please inter number A :");
//		int a = in.nextInt();
//		System.out.println("Please inter number B :");
//		int b = in.nextInt();
//		System.out.println("Please inter number C :");
//		int c = in.nextInt();
//		System.out.println("Sum of the numbers from A= "+a+ " to B= "+b+" is : "+sumRange(a,b));
//		System.out.println("Sum of the numbers from B= "+b+ " to C= "+c+" is : "+sumRange(b,c));

	} // main

	static double circleS(double radius) {
		final double PI = 3.14;
		double square = PI * radius * radius;
		return square;
	}

	static double ringS(double radius1, double radius2) {
		final double PI = 3.14;
		double squareRing = PI * (radius1 * radius1 - radius2 * radius2);
		return squareRing;
	}

	static double triangleP(double base, double height) {
		double b = Math.sqrt((base / 2) * (base / 2) + height * height);
		double perimeter = b * 2 + base;
		return perimeter;
	}

	static int sumRange(int a, int b) {
		int res = 0;
		if (a > b) {
			System.out.println("Incorrect value.");
		} else {
			for (int i = a; i <= b; i++) {
				res += i;
			}
		}
		return res;
	}

	static int rootsCount(int a, int b, int c) {
		int rootQuant;
		int d;
		d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.print("D= " + d + ". Quantity of roots is 2");
			rootQuant = 2;
		} else if (d < 0) {
			System.out.print("D= " + d + ". Quantity of roots is 0");
			rootQuant = 0;
		} else {
			System.out.print("D= " + d + ". Quantity of roots is 1");
			rootQuant = 1;
		}
		return rootQuant;
	}


} // class