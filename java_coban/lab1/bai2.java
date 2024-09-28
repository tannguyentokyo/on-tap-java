package lab1;

import java.util.Scanner;

public class bai2 {
//	Có phương trình như sau:
//		y = 4(x-3) + 20
//		Viết chương trình nhập x từ bàn phím và tính giá trị của y, với x và y là kiểu số nguyên.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số x: ");
		int x = scanner.nextInt();
		System.out.print("y = " + (4 * (x - 3) + 20));
	}

}
