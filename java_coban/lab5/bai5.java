package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
//	5. Cho 2 ma trận vuông A và B cấp n gồm các số thực.
//	a) Tính ma trận tổng C = A + B. Ma trận tổng được tính theo công thức: Cij = Aij + Bij.
//	b) Tính ma trận hiệu D = A - B. Ma trận hiệu được tính theo công thức: Dij = Aij – Bij.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng mảng muốn tạo = ");
		int n = scanner.nextInt();
		int m = 0;
		do {
			System.out.print("nhập số lượng phần tử của mỗi mảng(phải bằng số lượng mảng) = ");
			m = scanner.nextInt();
		} while (m != n);
		ArrayList<ArrayList<Integer>> AbigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				System.out.print("nhập phần tử thứ " + (j + 1) + " của mảng thứ " + (i + 1) + " của ma trận A = ");
				smallArrayList.add(scanner.nextInt());
			}
			AbigArrayList.add(smallArrayList);
		}

		ArrayList<ArrayList<Integer>> BbigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				System.out.print("nhập phần tử thứ " + (j + 1) + " của mảng thứ " + (i + 1) + " của ma trận B = ");
				smallArrayList.add(scanner.nextInt());
			}
			BbigArrayList.add(smallArrayList);
		}

		ArrayList<ArrayList<Integer>> CbigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				smallArrayList.add(AbigArrayList.get(i).get(j) - BbigArrayList.get(i).get(j));
			}
			CbigArrayList.add(smallArrayList);
		}

		ArrayList<ArrayList<Integer>> DbigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				smallArrayList.add(AbigArrayList.get(i).get(j) + BbigArrayList.get(i).get(j));
			}
			DbigArrayList.add(smallArrayList);
		}
		System.out.println("ma trận A : ");
		for (ArrayList<Integer> i : AbigArrayList) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("ma trận B : ");
		for (ArrayList<Integer> i : BbigArrayList) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("ma trận hiệu C : ");
		for (ArrayList<Integer> i : CbigArrayList) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("ma trận tổng D : ");
		for (ArrayList<Integer> i : DbigArrayList) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
