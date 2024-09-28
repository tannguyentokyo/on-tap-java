package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
//	1. Cho ma trận các số nguyên kích thước m x n:
//		a) In ra phần tử lớn nhất và nhỏ nhất của ma trận.
//		b) Tính tổng các phần tử của ma trận.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.print("nhập số lượng mảng muốn tạo: ");
		int n=scanner.nextInt();
		System.out.print("nhập số lượng phần tử của mỗi mảng: ");
		int m=scanner.nextInt();
		ArrayList<ArrayList<Integer>>bigArrayList=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			ArrayList<Integer>smallArrayList=new ArrayList<Integer>();
			for(int j=0;j<m;j++) {
				System.out.print("nhập phần tử thứ "+(j+1)+" của mảng thứ "+(i+1)+" = ");
				smallArrayList.add(scanner.nextInt());
			}
			bigArrayList.add(smallArrayList);
		}
		int max=bigArrayList.get(0).get(0);
		int min=bigArrayList.get(0).get(0);
		int tong=0;
		for(ArrayList<Integer> i:bigArrayList) {
			for(int j:i) {
				if(j>max) {
					max=j;
				}
				if(j<min) {
					min=j;
				}
				tong+=j;
			}
		}
		System.out.println("số lớn nhất của ma trận = "+max);
		System.out.println("số nlnhỏ nhất của ma trận = "+min);
		System.out.println("tổng các phần tử của ma trận = "+tong);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
