package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai06 {
//	6. Cho một dãy gồm n số.
//
//	a. Kiểm tra xem dãy có tăng dần hay không.
//	b. Sắp xếp dãy theo thứ tự tăng dần. In dãy kết quả ra màn hình.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số lượng phần tử của dãy số: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("nhập giá trị phần tử: ");
			arr[i] = scanner.nextInt();
		}

		int check = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					check = 1;
					break;
				}
			}
		}
		if (check == 0) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.print(" : là 1 dãy số tăng dần");
		} else {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println(" : ko phải là 1 dãy tăng dần");
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < arr[i]) {
						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
					}
				}
			}
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.print(" : đây là dãy số sau khi sắp xếp tăng dần");
		}

	}

}
