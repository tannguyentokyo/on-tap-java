package lab4;

import java.util.Scanner;

public class bai02 {
//	2. Cho n số nguyên. Tìm xem phần tử lớn nhất xuất hiện trong dãy mấy lần.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhập giá trị phần tử thứ " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		System.out.print("phần tử lớn nhất của mảng = " + max + " và xuất hiện: " + count + " lần");

	}

}
