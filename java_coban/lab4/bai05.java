package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai05 {
//	5. Cho n số và số x.
//
//	a. Xác định xem số x có xuất hiện trong dãy không?
//	b. Cho biết số x xuất hiện trong dãy bao nhiêu lần và tại các vị trí nào?
//	c. Loại bỏ khỏi dãy tất cả các phần tử bằng x. In cả 2 dãy ra màn hình.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("nhập số lượng mảng: ");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("nhập giá trị phần tử: ");
				arr[i] = scanner.nextInt();
			}
			System.out.print("nhập số muốn kiểm tra: ");
			int x = scanner.nextInt();
			int count = 0;
			ArrayList<Integer> position = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == x) {
					position.add(count, i);
					count++;
				}
			}
			int[] arr2 = new int[n - count];
			int t = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != x) {
					arr2[t] = arr[i];
					t++;
				}
			}
			if (count == 0) {
				System.out.print("số " + x + " ko xuất hiện trong dãy số");
			} else {
				System.out.println("số " + x + " có xuất hiện trong dãy số");
				System.out.print("số " + x + " xuất hiện " + count + " lần tại các vị trí: ");
				for (int i : position) {
					System.out.print(i + " ");
				}
				System.out.print("\ndãy số ban đầu là: ");
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.print("\ndãy số sau khi bỏ " + x + " là: ");
				for (int i : arr2) {
					System.out.print(i + " ");
				}
			}

		} catch (Exception e) {
			System.out.print("wrong answer");
		}

	}

}
