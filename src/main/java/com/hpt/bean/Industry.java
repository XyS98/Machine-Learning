package com.hpt.bean;


public class Industry {

  private int indno;
  private String indname;


  public int getIndno() {
    return indno;
  }

  public void setIndno(int indno) {
    this.indno = indno;
  }


  public String getIndname() {
    return indname;
  }

  public void setIndname(String indname) {
    this.indname = indname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Industry)) return false;

    Industry industry = (Industry) o;

    if (indno != industry.indno) return false;
    return indname != null ? indname.equals(industry.indname) : industry.indname == null;
  }

  @Override
  public int hashCode() {
    int result = indno;
    result = 31 * result + (indname != null ? indname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Industry{" +
            "indno=" + indno +
            ", indname='" + indname + '\'' +
            '}';
  }


}
