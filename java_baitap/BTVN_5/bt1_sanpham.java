package BTVN_5;

import java.sql.Date;

public class bt1_sanpham {
String mspString;
String tenspString;
String tenhangsxString;
Date ngaynhapDate;
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
public Date getNgaynhapDate() {
	return ngaynhapDate;
}
public void setNgaynhapDate(Date ngaynhapDate) {
	this.ngaynhapDate = ngaynhapDate;
}
public bt1_sanpham(String mspString, String tenspString, String tenhangsxString, Date ngaynhapDate) {
	super();
	this.mspString = mspString;
	this.tenspString = tenspString;
	this.tenhangsxString = tenhangsxString;
	this.ngaynhapDate = ngaynhapDate;
}

}
