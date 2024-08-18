package ngay1;

import java.util.Scanner;

public class bai5 {
//	Nhập vào tổng số giây. Hãy chuyển đổi sang giờ, phút, giây và in ra theo dạng h:m:s.
//	Ví dụ: 1999 giây => 5:3:19

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập vào số giây: ");
		int s = scanner.nextInt();
		int s0 = s;
		int h = 0;
		int m = 0;
		for (int i = 3600; i <= s; i++) {
			if (i % 3600 == 0) {
				h++;
			}
		}
		s = s - (h * 3600);
		for (int i = 60; i <= s; i++) {
			if (i % 60 == 0) {
				m++;
			}
		}
		s = s - (m * 60);
		System.out.print(s0 + " giây = " + h + ":" + m + ":" + s);
	}
}
