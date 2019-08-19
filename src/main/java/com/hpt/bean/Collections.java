package com.hpt.bean;


public class Collections {

  private int cono;
  private int collectType;
  private int tlno;
  private int mno;
  private int sbno;


  public int getCono() {
    return cono;
  }

  public void setCono(int cono) {
    this.cono = cono;
  }


  public int getCollectType() {
    return collectType;
  }

  public void setCollectType(int collectType) {
    this.collectType = collectType;
  }


  public int getTlno() {
    return tlno;
  }

  public void setTlno(int tlno) {
    this.tlno = tlno;
  }


  public int getMno() {
    return mno;
  }

  public void setMno(int mno) {
    this.mno = mno;
  }


  public int getSbno() {
    return sbno;
  }

  public void setSbno(int sbno) {
    this.sbno = sbno;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Collections)) return false;

    Collections that = (Collections) o;

    if (cono != that.cono) return false;
    if (collectType != that.collectType) return false;
    if (tlno != that.tlno) return false;
    if (mno != that.mno) return false;
    return sbno == that.sbno;
  }

  @Override
  public int hashCode() {
    int result = cono;
    result = 31 * result + collectType;
    result = 31 * result + tlno;
    result = 31 * result + mno;
    result = 31 * result + sbno;
    return result;
  }

  @Override
  public String toString() {
    return "Collections{" +
            "cono=" + cono +
            ", collectType=" + collectType +
            ", tlno=" + tlno +
            ", mno=" + mno +
            ", sbno=" + sbno +
            '}';
  }


}
