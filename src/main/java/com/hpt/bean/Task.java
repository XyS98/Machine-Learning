package com.hpt.bean;


public class Task {

  private String tno;
  private int mno;
  private int empno;
  private String picloc;
  private String docloc;
  private int wino;
  private String title;
  private String descr;
  private int tasktype;
  private double price;
  private int taskweight;
  private int ischecked;
  
  private String winame;
  private String releaseTime;
  private String checkTime;

  public Task() {
	super();
	// TODO Auto-generated constructor stub
}

public Task(String tno, int mno, int empno, String picloc, String docloc, int wino, String title, String descr,
		int tasktype, double price, int taskweight, int ischecked, String winame, String releaseTime,
		String checkTime) {
	super();
	this.tno = tno;
	this.mno = mno;
	this.empno = empno;
	this.picloc = picloc;
	this.docloc = docloc;
	this.wino = wino;
	this.title = title;
	this.descr = descr;
	this.tasktype = tasktype;
	this.price = price;
	this.taskweight = taskweight;
	this.ischecked = ischecked;
	this.winame = winame;
	this.releaseTime = releaseTime;
	this.checkTime = checkTime;
}

@Override
public String toString() {
	return "Task [tno=" + tno + ", mno=" + mno + ", empno=" + empno + ", picloc=" + picloc + ", docloc=" + docloc
			+ ", wino=" + wino + ", title=" + title + ", descr=" + descr + ", tasktype=" + tasktype + ", price=" + price
			+ ", taskweight=" + taskweight + ", ischecked=" + ischecked + ", winame=" + winame + ", releaseTime="
			+ releaseTime + ", checkTime=" + checkTime + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((checkTime == null) ? 0 : checkTime.hashCode());
	result = prime * result + ((descr == null) ? 0 : descr.hashCode());
	result = prime * result + ((docloc == null) ? 0 : docloc.hashCode());
	result = prime * result + empno;
	result = prime * result + ischecked;
	result = prime * result + mno;
	result = prime * result + ((picloc == null) ? 0 : picloc.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((releaseTime == null) ? 0 : releaseTime.hashCode());
	result = prime * result + tasktype;
	result = prime * result + taskweight;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((tno == null) ? 0 : tno.hashCode());
	result = prime * result + ((winame == null) ? 0 : winame.hashCode());
	result = prime * result + wino;
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
	Task other = (Task) obj;
	if (checkTime == null) {
		if (other.checkTime != null)
			return false;
	} else if (!checkTime.equals(other.checkTime))
		return false;
	if (descr == null) {
		if (other.descr != null)
			return false;
	} else if (!descr.equals(other.descr))
		return false;
	if (docloc == null) {
		if (other.docloc != null)
			return false;
	} else if (!docloc.equals(other.docloc))
		return false;
	if (empno != other.empno)
		return false;
	if (ischecked != other.ischecked)
		return false;
	if (mno != other.mno)
		return false;
	if (picloc == null) {
		if (other.picloc != null)
			return false;
	} else if (!picloc.equals(other.picloc))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (releaseTime == null) {
		if (other.releaseTime != null)
			return false;
	} else if (!releaseTime.equals(other.releaseTime))
		return false;
	if (tasktype != other.tasktype)
		return false;
	if (taskweight != other.taskweight)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (tno == null) {
		if (other.tno != null)
			return false;
	} else if (!tno.equals(other.tno))
		return false;
	if (winame == null) {
		if (other.winame != null)
			return false;
	} else if (!winame.equals(other.winame))
		return false;
	if (wino != other.wino)
		return false;
	return true;
}

public String getTno() {
	return tno;
}

public void setTno(String tno) {
	this.tno = tno;
}

public int getMno() {
	return mno;
}

public void setMno(int mno) {
	this.mno = mno;
}

public int getEmpno() {
	return empno;
}

public void setEmpno(int empno) {
	this.empno = empno;
}

public String getPicloc() {
	return picloc;
}

public void setPicloc(String picloc) {
	this.picloc = picloc;
}

public String getDocloc() {
	return docloc;
}

public void setDocloc(String docloc) {
	this.docloc = docloc;
}

public int getWino() {
	return wino;
}

public void setWino(int wino) {
	this.wino = wino;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescr() {
	return descr;
}

public void setDescr(String descr) {
	this.descr = descr;
}

public int getTasktype() {
	return tasktype;
}

public void setTasktype(int tasktype) {
	this.tasktype = tasktype;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getTaskweight() {
	return taskweight;
}

public void setTaskweight(int taskweight) {
	this.taskweight = taskweight;
}

public int getIschecked() {
	return ischecked;
}

public void setIschecked(int ischecked) {
	this.ischecked = ischecked;
}

public String getWiname() {
	return winame;
}

public void setWiname(String winame) {
	this.winame = winame;
}

public String getReleaseTime() {
	return releaseTime;
}

public void setReleaseTime(String releaseTime) {
	this.releaseTime = releaseTime;
}

public String getCheckTime() {
	return checkTime;
}

public void setCheckTime(String checkTime) {
	this.checkTime = checkTime;
}
  
  
}
