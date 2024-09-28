package lab4;

import java.util.Scanner;

public class bai01 {
//	1. Cho n số nguyên
//	a. Tìm vị trí và giá trị phần tử lớn nhất của dãy.
//	b. Tìm vị trí và giá trị phần tử nhỏ nhất của dãy.
//	c. Tính tổng các phần tử của dãy.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhập giá trị phần tử thứ " + (i + 1)+" : ");
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		int vitrimax = 0;
		int min = arr[0];
		int vitrimin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				vitrimax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				vitrimin = i;
			}
		}
		int tong = 0;
		for (int i = 0; i < arr.length; i++) {
			tong += arr[i];
		}
		System.out.println("phần tử nhỏ nhất của mảng = " + min + " và nằm ở vị trí thứ: " + vitrimin);
		System.out.println("phần tử lớn nhất của mảng = " + max + " và nằm ở vị trí thứ: " + vitrimax);
		System.out.print("tổng các phần tử trong mảng là: " + tong);

	}

}
