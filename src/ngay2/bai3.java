package ngay2;

import java.util.Scanner;

public class bai3 {
//	1.3 Cho các hệ số a và b của phương trình ax + b = 0. Tìm nghiệm của phương trình.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số a: ");
		int a = scanner.nextInt();
		System.out.print("nhập số b: ");
		int b = scanner.nextInt();
		System.out.println("ax + b = 0");
		System.out.print("=> x = " + (-b / a));
	}

}
