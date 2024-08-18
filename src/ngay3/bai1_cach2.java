package ngay3;

import java.util.Scanner;

public class bai1_cach2 {
//	1. Nhập từ bàn phím vào các số nguyên và dừng lại khi nhập giá trị 0. Tính tổng, trung bình cộng và
//	tìm giá trị lớn nhất của các số nguyên vừa nhập.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		float tong = 0;
		int max = 0;
		int soluong = 0;
		do {
			System.out.print("nhập 1 số bất kỳ, nếu muốn kết thúc thì nhập 0: ");
			a = scanner.nextInt();
			soluong++;
			tong += a;
			if (a > max) {
				max = a;
			}
		} while (a != 0);
		System.out.println("tổng các số vừa nhập = " + tong);
		System.out.println("trung bình cộng các số vừa nhập = " + (tong / soluong));
		System.out.println("số lớn nhất trong các số vừa nhập = " + max);

	}

}
