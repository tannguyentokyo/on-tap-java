package lab1;

import java.util.Scanner;

public class bai4 {
//	Nhập vào bán kính hình tròn. Tính chu vi và diện tích hình tròn.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập bán kính hình tròn: ");
		float r = scanner.nextFloat();
		System.out.println("chu vi hình tròn: C = " + (2 * 3.14 * r));
		System.out.print("diện tích hình tròn: S = " + (3.14 * r * r));
	}

}
