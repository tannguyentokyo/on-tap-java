package BTVN_5;

import java.sql.Date;

public class bt1_dieuhoa extends bt1_sanpham {
int congsuat;
int giaban;
public int getCongsuat() {
	return congsuat;
}
public void setCongsuat(int congsuat) {
	this.congsuat = congsuat;
}
public int getGiaban() {
	return giaban;
}
public void setGiaban(int giaban) {
	this.giaban = giaban;
}
public bt1_dieuhoa(String mspString, String tenspString, String tenhangsxString, int ngaynhapDate, int congsuat,
		int giaban) {
	super(mspString, tenspString, tenhangsxString, ngaynhapDate);
	this.congsuat = congsuat;
	this.giaban = giaban;
}


}
