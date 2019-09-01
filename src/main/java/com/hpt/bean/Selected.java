package com.hpt.bean;


public class Selected {

  private int sbno;
  private String tno;
  private int mno;
  private int isselected;
  private String descr;
  private String picloc;
  private String uploadfile;


  private String nickName;


public Selected(int sbno, String tno, int mno, int isselected, String descr, String picloc, String uploadfile,
		String nickName) {
	super();
	this.sbno = sbno;
	this.tno = tno;
	this.mno = mno;
	this.isselected = isselected;
	this.descr = descr;
	this.picloc = picloc;
	this.uploadfile = uploadfile;
	this.nickName = nickName;
}


public Selected() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Selected [sbno=" + sbno + ", tno=" + tno + ", mno=" + mno + ", isselected=" + isselected + ", descr="
			+ descr + ", picloc=" + picloc + ", uploadfile=" + uploadfile + ", nickName=" + nickName + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((descr == null) ? 0 : descr.hashCode());
	result = prime * result + isselected;
	result = prime * result + mno;
	result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
	result = prime * result + ((picloc == null) ? 0 : picloc.hashCode());
	result = prime * result + sbno;
	result = prime * result + ((tno == null) ? 0 : tno.hashCode());
	result = prime * result + ((uploadfile == null) ? 0 : uploadfile.hashCode());
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
	Selected other = (Selected) obj;
	if (descr == null) {
		if (other.descr != null)
			return false;
	} else if (!descr.equals(other.descr))
		return false;
	if (isselected != other.isselected)
		return false;
	if (mno != other.mno)
		return false;
	if (nickName == null) {
		if (other.nickName != null)
			return false;
	} else if (!nickName.equals(other.nickName))
		return false;
	if (picloc == null) {
		if (other.picloc != null)
			return false;
	} else if (!picloc.equals(other.picloc))
		return false;
	if (sbno != other.sbno)
		return false;
	if (tno == null) {
		if (other.tno != null)
			return false;
	} else if (!tno.equals(other.tno))
		return false;
	if (uploadfile == null) {
		if (other.uploadfile != null)
			return false;
	} else if (!uploadfile.equals(other.uploadfile))
		return false;
	return true;
}


public int getSbno() {
	return sbno;
}


public void setSbno(int sbno) {
	this.sbno = sbno;
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


public int getIsselected() {
	return isselected;
}


public void setIsselected(int isselected) {
	this.isselected = isselected;
}


public String getDescr() {
	return descr;
}


public void setDescr(String descr) {
	this.descr = descr;
}


public String getPicloc() {
	return picloc;
}


public void setPicloc(String picloc) {
	this.picloc = picloc;
}


public String getUploadfile() {
	return uploadfile;
}


public void setUploadfile(String uploadfile) {
	this.uploadfile = uploadfile;
}


public String getNickName() {
	return nickName;
}


public void setNickName(String nickName) {
	this.nickName = nickName;
}
  
 
}
