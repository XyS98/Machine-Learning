package com.hpt.bean;


public class BillType {

  private int btno;
  private String btname;
  private int moneyflow;


  public int getBtno() {
    return btno;
  }

  public void setBtno(int btno) {
    this.btno = btno;
  }


  public String getBtname() {
    return btname;
  }

  public void setBtname(String btname) {
    this.btname = btname;
  }


  public int getMoneyflow() {
    return moneyflow;
  }

  public void setMoneyflow(int moneyflow) {
    this.moneyflow = moneyflow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BillType)) return false;

    BillType billType = (BillType) o;

    if (btno != billType.btno) return false;
    if (moneyflow != billType.moneyflow) return false;
    return btname != null ? btname.equals(billType.btname) : billType.btname == null;
  }

  @Override
  public int hashCode() {
    int result = btno;
    result = 31 * result + (btname != null ? btname.hashCode() : 0);
    result = 31 * result + moneyflow;
    return result;
  }

  @Override
  public String toString() {
    return "BillType{" +
            "btno=" + btno +
            ", btname='" + btname + '\'' +
            ", moneyflow=" + moneyflow +
            '}';
  }


}
