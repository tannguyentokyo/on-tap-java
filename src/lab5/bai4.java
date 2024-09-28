package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
//	Cho ma trận vuông A cấp n gồm các số nguyên. Tính tổng từng dòng của ma trận và tìm dòng có
//	tổng lớn nhất.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng mảng muốn tạo: ");
		int n = scanner.nextInt();
		int m=0;
		do {
			System.out.print("nhập phần tử của mảng(phải bằng với số lượng mảng): ");
			m = scanner.nextInt();
		} while (m != n);
		ArrayList<ArrayList<Integer>> bigArrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> smallArrayList = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				System.out.print("nhập phần tử thứ " + (j + 1) + " của mảng thứ " + (i + 1) + " = ");
				smallArrayList.add(scanner.nextInt());
			}
			bigArrayList.add(smallArrayList);
		}
		int tongmax = 0;
		int vitrimax = 0;
		for (int i = 0; i < bigArrayList.size(); i++) {
			int tong = 0;
			for (int j = 0; j < m; j++) {
				tong = bigArrayList.get(i).get(j) + tong;
			}
			System.out.println("tổng dòng thứ " + (i+1)+ " của mảng là = " + tong);
			if (tong > tongmax) {
				tongmax = tong;
				vitrimax = i+1;
			}
		}
		System.out.print("tổng lớn nhất = " + tongmax + " của dòng " + vitrimax);

	}

}
