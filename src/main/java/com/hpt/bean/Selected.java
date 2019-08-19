package com.hpt.bean;


public class Selected {

  private int sbno;
  private String tno;
  private int mno;
  private int isselected;
  private String descr;
  private String picloc;
  private String uploadfile;


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


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Selected)) return false;

    Selected selected = (Selected) o;

    if (sbno != selected.sbno) return false;
    if (mno != selected.mno) return false;
    if (isselected != selected.isselected) return false;
    if (tno != null ? !tno.equals(selected.tno) : selected.tno != null) return false;
    if (descr != null ? !descr.equals(selected.descr) : selected.descr != null) return false;
    if (picloc != null ? !picloc.equals(selected.picloc) : selected.picloc != null) return false;
    return uploadfile != null ? uploadfile.equals(selected.uploadfile) : selected.uploadfile == null;
  }

  @Override
  public int hashCode() {
    int result = sbno;
    result = 31 * result + (tno != null ? tno.hashCode() : 0);
    result = 31 * result + mno;
    result = 31 * result + isselected;
    result = 31 * result + (descr != null ? descr.hashCode() : 0);
    result = 31 * result + (picloc != null ? picloc.hashCode() : 0);
    result = 31 * result + (uploadfile != null ? uploadfile.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Selected{" +
            "sbno=" + sbno +
            ", tno='" + tno + '\'' +
            ", mno=" + mno +
            ", isselected=" + isselected +
            ", descr='" + descr + '\'' +
            ", picloc='" + picloc + '\'' +
            ", uploadfile='" + uploadfile + '\'' +
            '}';
  }


}
