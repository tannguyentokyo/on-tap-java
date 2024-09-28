package lab4;

import java.util.Scanner;

public class bai03 {
//	3. Nhập vào n số nguyên
//
//	a. Đếm số phần âm, dương, bằng 0 của dãy.
//	b. Xác định số âm lớn nhất và số dương nhỏ nhất.
//	c. Cho biết | tổng âm| có bằng tổng dương không.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhập giá trị phần tử: ");
			arr[i] = scanner.nextInt();
		}
		int soam = 0;
		int soduong = 0;
		int so0 = 0;
		int maxam = arr[0];
		int minduong = arr[0];
		int tongam = 0;
		int tongduong = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				soam++;
				tongam += arr[i];
			} else if (arr[i] == 0) {
				so0++;
			} else {
				soduong++;
				tongduong = tongduong + arr[i];
			}
			if (arr[i] < 0 && arr[i] > maxam || arr[i] < 0 && maxam == 0) {
				maxam = arr[i];
			}
			if (arr[i] > 0 && arr[i] < minduong || arr[i] > 0 && minduong == 0) {
				minduong = arr[i];
			}
		}
		System.out.println("mảng có " + soam + " số âm");
		System.out.println("mảng có " + soduong + " số dương");
		System.out.println("mảng có " + so0 + " số 0");
		System.out.println("số âm lớn nhất = " + maxam);
		System.out.println("số dương nhỏ nhất = " + minduong);
		if (tongam == tongduong) {
			System.out.print("tổng số âm bẳng tổng số dương");
		} else {
			System.out.print("tổng số âm ko bẳng tổng số dương");
		}
	}

}
