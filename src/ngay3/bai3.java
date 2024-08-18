package ngay3;

public class bai3 {
//	3. Năm nay cha 35 tuổi, con 4 tuổi. Tính xem sau bao nhiêu năm nữa tuổi cha gấp đôi tuổi con.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cha=35;
		int con=4;
		int nam=1;
	for(int i=con;i<=(cha/2);i++) {
		cha++;
		nam++;
	}
		System.out.print("sau "+nam+" tuổi cha gấp đôi tuổi con");
	}

}
