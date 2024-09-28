package lab1;

import java.util.Scanner;

public class bai1 {
//	Viết chương trình hiển thị ra thông báo: “Please input one integer and one floating-point
//	number”. Sau đó người dùng sẽ nhập vào từ bàn phím một số nguyên x và một số thập phân y.
//	Hiển thị ra màn hình: “Input values are” + x + “and ” + y + “their product is ” + x*y
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input one integer and one floating-point number ");
		System.out.print("integer number: ");
		int x = scanner.nextInt();
		System.out.print("floating-point number: ");
		float y = scanner.nextFloat();
		System.out.print("Input values are: " + x + " and " + y + " their product is: " + x * y);
	}

}
