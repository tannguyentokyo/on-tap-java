package BTVN_5;

import java.sql.Date;

public class bt1_sanpham {
String mspString;
String tenspString;
String tenhangsxString;
int  ngaynhapDate;
public String getMspString() {
	return mspString;
}
public void setMspString(String mspString) {
	this.mspString = mspString;
}
public String getTenspString() {
	return tenspString;
}
public void setTenspString(String tenspString) {
	this.tenspString = tenspString;
}
public String getTenhangsxString() {
	return tenhangsxString;
}
public void setTenhangsxString(String tenhangsxString) {
	this.tenhangsxString = tenhangsxString;
}
public int getNgaynhapDate() {
	return ngaynhapDate;
}
public void setNgaynhapDate(int ngaynhapDate) {
	this.ngaynhapDate = ngaynhapDate;
}
public bt1_sanpham(String mspString, String tenspString, String tenhangsxString, int ngaynhapDate) {
	super();
	this.mspString = mspString;
	this.tenspString = tenspString;
	this.tenhangsxString = tenhangsxString;
	this.ngaynhapDate = ngaynhapDate;
}


}
