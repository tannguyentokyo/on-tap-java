package lab4;

import java.util.Scanner;

public class bai04 {
//	4. Cho n số. Đảo thứ tự của dãy theo nguyên tắc sau: A[1] đổi cho với A[n], A[2] đổi cho với A[n-1], ...
//	In kết quả ra màn hình.
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
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = arr[(n - 1) - i];
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i : arr2) {
			System.out.print(i + " ");
		}

	}

}
