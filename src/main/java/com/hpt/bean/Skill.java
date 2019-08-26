package com.hpt.bean;

public class Skill {
	private int skno;
	private int mno;
	private int wino;
	
	private String nickName;
	private String winame;
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(int skno, int mno, int wino, String nickName, String winame) {
		super();
		this.skno = skno;
		this.mno = mno;
		this.wino = wino;
		this.nickName = nickName;
		this.winame = winame;
	}

	@Override
	public String toString() {
		return "Skill [skno=" + skno + ", mno=" + mno + ", wino=" + wino + ", nickName=" + nickName + ", winame="
				+ winame + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mno;
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + skno;
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
		Skill other = (Skill) obj;
		if (mno != other.mno)
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (skno != other.skno)
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

	public int getSkno() {
		return skno;
	}

	public void setSkno(int skno) {
		this.skno = skno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getWino() {
		return wino;
	}

	public void setWino(int wino) {
		this.wino = wino;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getWiname() {
		return winame;
	}

	public void setWiname(String winame) {
		this.winame = winame;
	}
	
	
	
	
}
