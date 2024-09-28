package lab1;

import java.util.Scanner;

public class bai3 {
//	Một mile bằng 1.609km. Viết chương trình cho người dùng nhập 1 số, sau đó chuyển đổi số đó
//	sang km (ví dụs, người dùng nhập 5, thì thông báo ra màn hình: 5miles = 8.045km.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số mile muốn chuyển đổi: ");
		float a = scanner.nextFloat();
		System.out.print(a + " miles = " + (a * 1.609) + " km");
	}

}
