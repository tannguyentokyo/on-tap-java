package BTVN_5;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class bt1_zmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.print("nhập số lượng điều hòa: ");
			int n=scanner.nextInt();
			ArrayList<bt1_dieuhoa>listdieuhoa=new ArrayList<bt1_dieuhoa>();
			for(int i=0;i<n;i++) {
				scanner.nextLine();
				System.out.print("nhập mã sản phẩm thứ "+(1+i)+" = ");
				String maspString=scanner.nextLine();
				scanner.nextLine();
				System.out.print("nhập tên sản phẩm thứ "+(1+i)+" = ");
				String tenspString=scanner.nextLine();
				scanner.nextLine();
				System.out.print("nhập tên hãng sản xuất thứ "+(1+i)+" = ");
				String tenhangsxString=scanner.nextLine();
				System.out.print("ngày nhập = ");
				int ngaynhap=scanner.nextInt();
				System.out.print("nhập công suất = ");
				int congsuat=scanner.nextInt();
				System.out.print("nhập giá bán = ");
				int giaban=scanner.nextInt();
				listdieuhoa.add(new bt1_dieuhoa(maspString, tenspString, tenhangsxString, ngaynhap, congsuat, giaban));
			}
			int mingia=listdieuhoa.get(0).getGiaban();
			for(bt1_dieuhoa i:listdieuhoa) {
				if(i.getGiaban()<mingia) {
					mingia=i.getGiaban();
				}
			}
			int t=0;
			for(bt1_dieuhoa i:listdieuhoa) {
				if(i.getTenhangsxString().equals("Electrolux")&&i.getGiaban()==mingia) {
					t=1;
					System.out.println(i.getMspString()+" "+i.getTenspString()+" "+i.getTenhangsxString()+" "+i.getGiaban());
				}
			}
			if(t==0) {
				System.out.print("ko có sản phẩm nào phù hợp");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
	}

}
