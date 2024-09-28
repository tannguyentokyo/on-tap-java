package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai08_matrix {
//	8. Cho ma trận các số nguyên kích thước m x n:
//
//		a. In ra phần tử lớn nhất và nhỏ nhất của ma trận.
//		b. Tính tổng các phần tử của ma trận.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng giá trị của 1 dãy số: ");
		int n = scanner.nextInt();
		System.out.print("nhập số lượng dãy số: ");
		int m = scanner.nextInt();
		ArrayList<ArrayList<Integer>> bigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				System.out.print("nhập giá trị thứ " + (j + 1) + " của dãy số thứ " + (i + 1) + " = ");
				smallArrayList.add(scanner.nextInt());
			}
			bigArrayList.add(smallArrayList);
		}
		System.out.println("dãy ma trận là: ");
		for (ArrayList<Integer> i : bigArrayList) {
			System.out.println(i + " ");
		}
		int max = bigArrayList.get(0).get(0);
		int min = bigArrayList.get(0).get(0);
		int tong = 0;
		for (ArrayList<Integer> i : bigArrayList) {
			for (int j : i) {
				if (j > max) {
					max = j;
				}
				if (j < min) {
					min = j;
				}
				tong += j;
			}
		}
		System.out.println("số lớn nhất trong ma trận = " + max);
		System.out.println("số bé nhất trong ma trận = " + min);
		System.out.print("tổng các số trong ma trận = " + tong);

	}

}
