package com.hpt.bean;

public class Bill {

  private String bno;
  private int mno;
  private String descr;
  private double amount;
  private int btno;
  private String bdate;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Bill)) return false;

    Bill bill = (Bill) o;

    if (mno != bill.mno) return false;
    if (Double.compare(bill.amount, amount) != 0) return false;
    if (btno != bill.btno) return false;
    if (bno != null ? !bno.equals(bill.bno) : bill.bno != null) return false;
    if (descr != null ? !descr.equals(bill.descr) : bill.descr != null) return false;
    return bdate != null ? bdate.equals(bill.bdate) : bill.bdate == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = bno != null ? bno.hashCode() : 0;
    result = 31 * result + mno;
    result = 31 * result + (descr != null ? descr.hashCode() : 0);
    temp = Double.doubleToLongBits(amount);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + btno;
    result = 31 * result + (bdate != null ? bdate.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Bill{" +
            "bno='" + bno + '\'' +
            ", mno=" + mno +
            ", descr='" + descr + '\'' +
            ", amount=" + amount +
            ", btno=" + btno +
            ", bdate='" + bdate + '\'' +
            '}';
  }



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
