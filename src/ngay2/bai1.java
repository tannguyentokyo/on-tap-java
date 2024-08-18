package ngay2;

import java.util.Scanner;

public class bai1 {
//	1.1 Cho 3 số thực a,b và c. Tìm số lớn nhất giữa 2 số đó.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập 3 số thực a,b và c");
		System.out.print("nhập số a: ");
		int a = scanner.nextInt();
		System.out.print("nhập số b: ");
		int b = scanner.nextInt();
		System.out.print("nhập số c: ");
		int c = scanner.nextInt();
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.print("số lớn nhất là: " + max);

	}

}
