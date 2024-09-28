package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1_cach1 {
//	1. Nhập từ bàn phím vào các số nguyên và dừng lại khi nhập giá trị 0. Tính tổng, trung bình cộng và
//	tìm giá trị lớn nhất của các số nguyên vừa nhập.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		do {
			System.out.print("nhập 1 số bất kỳ, nếu muốn kết thúc thì nhập 0: ");
			a = scanner.nextInt();
			arrayList.add(a);
		} while (a != 0);
		float tong=0;
		int soluong = 0;
		int max = arrayList.get(0);
		for (int i = 0; i < arrayList.size(); i++) {
			tong += arrayList.get(i);
			soluong++;
			if (arrayList.get(i) > max) {
				max = arrayList.get(i);
			}
		}
		System.out.println("tổng các số vừa nhập = " + tong);
		System.out.println("trung bình cộng các số vừa nhập = " + (tong / soluong));
		System.out.println("số lớn nhất trong các số vừa nhập = " + max);

	}

}
