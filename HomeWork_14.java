package HomeWork;

import java.util.Random;
import java.util.Arrays;

public class HomeWork_14 {

	static void fillMatrix(int[][] fmas) {
		Random gen = new Random();
		for (int i = 0; i < fmas.length; i++) {
			for (int j = 0; j < fmas[i].length; j++) {
				fmas[i][j] = gen.nextInt(10);
			}
		}
	}

	static void printMatrix(int[][] fmas) {
		for (int i = 0; i < fmas.length; i++) {
			System.out.print("Row " + i + " [ ");
			for (int j = 0; j < fmas[i].length; j++) {
				System.out.print(fmas[i][j] + " ");
			}
			System.out.println(" ]");
		}
	}

	static void task20(int[][] fmas) {
		for (int k = 0; k < fmas[0].length; k++) {
			int p = 1;
			for (int i = 0; i < fmas.length; i++) {
				p *= fmas[i][k];
			}
			System.out.println("������������ ������� ������� " + k + " = " + p);
		}
	}

	static void task21(int[][] fmas) {
		for (int i = 1; i <fmas.length; i = i + 2) {
			double sum = 0;
			for (int j = 0; j < fmas[i].length; j++) {
				sum += fmas[i][j] / (double) fmas[i].length;
			}
			System.out.println("Average of row " + i + " is : " + sum);
		}
	}

	static int taskL1(int[][] fmas) {
		int sum = 0;
		for (int a = 0; a < fmas.length; a++) {
			sum += fmas[a][a];
		}
		return sum;
	}

	public static void main(String[] args) {

//		Matrix20. ���� ������� ������� M � N. ��� ������� ������� ������� �����
//        ������������ ��� ���������.

//		final int n = 11;
//		final int m = 10;
//		int[][] mas = new int[n][m];
//
//		fillMatrix(mas);
////		System.out.println(Arrays.deepToString(mas));
//		printMatrix(mas);
//		task20(mas);
//
//// �������������� ������� ������
//		System.out.println();
//		for (int j = 0; j < mas.length; j++) {
//			{
//				int mult = 1;
//				for (int i = 0; i < mas.length; i++) {
//					mult *= mas[i][j];
//				}
//				System.out.println("������������ ������� ������� " + j + " = " + mult);
//			}
//		}


//        Matrix21.���� ������� ������� M x N.��� ������ ������ ������� � �������� �������(1, 3,. . .)����� �������
//        �������������� �� ���������. �������� �������� �� ������������.

		final int n = 11;
		final int m = 10;
		int[][] mas = new int[n][m];

		fillMatrix(mas);
		printMatrix(mas);
		System.out.println(" ");
		task21(mas);

// ����� ����� ��������� ������� ��������� �������
		
//        fillMatrix(mas);
//        System.out.println(Arrays.deepToString(mas));
//
//        System.out.println(taskL1(mas));


	}
}
