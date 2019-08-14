package com.hpt.bean;

public class Bill {

  private String bno;
  private int mno;
  private String descr;
  private double amount;
  private int btno;
  private String bdate;


  public String getBno() {
    return bno;
  }

  public void setBno(String bno) {
    this.bno = bno;
  }


  public int getMno() {
    return mno;
  }

  public void setMno(int mno) {
    this.mno = mno;
  }


  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public int getBtno() {
    return btno;
  }

  public void setBtno(int btno) {
    this.btno = btno;
  }


  public String getBdate() {
    return bdate;
  }

  public void setBdate(String bdate) {
    this.bdate = bdate;
  }

}
