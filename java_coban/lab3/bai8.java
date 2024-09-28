package lab3;

import java.util.Scanner;

public class bai8 {
//	8. Cho số tự nhiên n.
//	a. Tính tổng S = 1 + 2 + ... + n.
//	b. Tính giai thừa n! = 1 x 2 x ... x n.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.print("nhập số tự nhiên n: ");
		int n=scanner.nextInt();
		int tong=0;
		int tich=1;
		for(int i=0;i<=n;i++) {
			tong=tong+i;
		}
		for(int i=1;i<=n;i++) {
			tich=tich*i;
		}
		System.out.println("tổng S = "+tong);
		System.out.print("giai thừa "+n+"! = "+tich);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
