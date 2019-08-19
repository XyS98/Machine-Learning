package com.hpt.bean;


public class Worksitem {
  private int wino;
  private String winame;
  private int wno;
  private int mno;

  private String wname;
  private String indname;

  public Worksitem() {
	super();
	// TODO Auto-generated constructor stub
}

  public Worksitem(int wino, String winame, int wno, int mno, String wname, String indname) {
	super();
	this.wino = wino;
	this.winame = winame;
	this.wno = wno;
	this.mno = mno;
	this.wname = wname;
	this.indname = indname;
}

  @Override
	public String toString() {
	return "Worksitem [wino=" + wino + ", winame=" + winame + ", wno=" + wno + ", mno=" + mno + ", wname=" + wname
			+ ", indname=" + indname + "]";
}

public int getWino() {
	return wino;
}

public void setWino(int wino) {
	this.wino = wino;
}

public String getWiname() {
	return winame;
}

public void setWiname(String winame) {
	this.winame = winame;
}

public int getWno() {
	return wno;
}

public void setWno(int wno) {
	this.wno = wno;
}

public int getMno() {
	return mno;
}

public void setMno(int mno) {
	this.mno = mno;
}

public String getWname() {
	return wname;
}

public void setWname(String wname) {
	this.wname = wname;
}

public String getIndname() {
	return indname;
}

public void setIndname(String indname) {
	this.indname = indname;
}

  

  

}
