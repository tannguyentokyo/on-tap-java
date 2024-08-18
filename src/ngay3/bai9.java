package ngay3;

import java.util.Scanner;

public class bai9 {
//	Cho số tiền gởi ngân hàng P, lãi suất tiền gởi từng tháng r, số tháng gởi n. Tính và xuất số tiền sẽ
//	được rút ra F sau n tháng theo công thức F = P(1 + r)n

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số tiền gửi ngân hàng ban đầu: ");
		double P = scanner.nextDouble();
		System.out.print("nhập lãi suất tiền gửi: ");
		float r = scanner.nextFloat();
		System.out.print("nhập số tháng muốn gửi: ");
		int n = scanner.nextInt();
		float t = 1;
		for (int i = 0; i < n; i++) {
			t = t * (1 + r);
		}
		System.out.print("số tiền sẽ rút ra là: F = " + (P * t) + " VND");

	}
	
  //nếu bài này logic đúng, mà lãi suất thật thế này thì ngân hàng phá sản mất :))
}
