package com.hpt.bean;


public class Works {

  private int wno;
  private int indno;
  private String wname;


  public int getWno() {
    return wno;
  }

  public void setWno(int wno) {
    this.wno = wno;
  }


  public int getIndno() {
    return indno;
  }

  public void setIndno(int indno) {
    this.indno = indno;
  }


  public String getWname() {
    return wname;
  }

  public void setWname(String wname) {
    this.wname = wname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Works)) return false;

    Works works = (Works) o;

    if (wno != works.wno) return false;
    if (indno != works.indno) return false;
    return wname != null ? wname.equals(works.wname) : works.wname == null;
  }

  @Override
  public int hashCode() {
    int result = wno;
    result = 31 * result + indno;
    result = 31 * result + (wname != null ? wname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Works{" +
            "wno=" + wno +
            ", indno=" + indno +
            ", wname='" + wname + '\'' +
            '}';
  }


}
