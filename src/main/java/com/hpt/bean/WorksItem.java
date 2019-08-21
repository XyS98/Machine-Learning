package com.hpt.bean;


public class WorksItem {

  private int wino; 
  private String winame;
  private int wno;
  private int mno;

  
  private String wname;
  
  private String indname;
  private int indno;
  public WorksItem() {
	super();
	// TODO Auto-generated constructor stub
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
public int getIndno() {
	return indno;
}
public void setIndno(int indno) {
	this.indno = indno;
}
@Override
public String toString() {
	return "WorksItem [wino=" + wino + ", winame=" + winame + ", wno=" + wno + ", mno=" + mno + ", wname=" + wname
			+ ", indname=" + indname + ", indno=" + indno + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((indname == null) ? 0 : indname.hashCode());
	result = prime * result + indno;
	result = prime * result + mno;
	result = prime * result + ((winame == null) ? 0 : winame.hashCode());
	result = prime * result + wino;
	result = prime * result + ((wname == null) ? 0 : wname.hashCode());
	result = prime * result + wno;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	WorksItem other = (WorksItem) obj;
	if (indname == null) {
		if (other.indname != null)
			return false;
	} else if (!indname.equals(other.indname))
		return false;
	if (indno != other.indno)
		return false;
	if (mno != other.mno)
		return false;
	if (winame == null) {
		if (other.winame != null)
			return false;
	} else if (!winame.equals(other.winame))
		return false;
	if (wino != other.wino)
		return false;
	if (wname == null) {
		if (other.wname != null)
			return false;
	} else if (!wname.equals(other.wname))
		return false;
	if (wno != other.wno)
		return false;
	return true;
}

  
  
  
}
