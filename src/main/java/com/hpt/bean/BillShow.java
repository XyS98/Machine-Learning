package com.hpt.bean;

public class BillShow {
	private float inm;
	private float outm;
	
	private int day;
	private int year; // 那年
	private int mon; // 那月
	
	private int mno;
	public BillShow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillShow(float inm, float outm, int day, int year, int mon, int mno) {
		super();
		this.inm = inm;
		this.outm = outm;
		this.day = day;
		this.year = year;
		this.mon = mon;
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "BillShow [inm=" + inm + ", outm=" + outm + ", day=" + day + ", year=" + year + ", mon=" + mon + ", mno="
				+ mno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + Float.floatToIntBits(inm);
		result = prime * result + mno;
		result = prime * result + mon;
		result = prime * result + Float.floatToIntBits(outm);
		result = prime * result + year;
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
		BillShow other = (BillShow) obj;
		if (day != other.day)
			return false;
		if (Float.floatToIntBits(inm) != Float.floatToIntBits(other.inm))
			return false;
		if (mno != other.mno)
			return false;
		if (mon != other.mon)
			return false;
		if (Float.floatToIntBits(outm) != Float.floatToIntBits(other.outm))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	public float getInm() {
		return inm;
	}
	public void setInm(float inm) {
		this.inm = inm;
	}
	public float getOutm() {
		return outm;
	}
	public void setOutm(float outm) {
		this.outm = outm;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMon() {
		return mon;
	}
	public void setMon(int mon) {
		this.mon = mon;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}

	
	
}
